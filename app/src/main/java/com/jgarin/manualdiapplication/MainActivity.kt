package com.jgarin.manualdiapplication

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.jgarin.ui.UiModule

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Handler().postDelayed({launchEditScreen()}, 500)

    }

    private fun launchEditScreen() {
        UiModule().launch(this)
    }
}