package com.jgarin.workflow_navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jgarin.navigation.Navigation
import com.jgarin.navigation.NavigationModule
import kotlinx.android.synthetic.main.activity_navigation.*

class NavigationActivity : AppCompatActivity() {

    private val navigation: Navigation by lazy { NavigationModule(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)

        btnEdit.setOnClickListener { navigation.goToEdit(this) }
        btnSeparate.setOnClickListener { navigation.goToSeparate(this) }
        btnTransDeps.setOnClickListener { navigation.goToTransitive(this) }

    }

}