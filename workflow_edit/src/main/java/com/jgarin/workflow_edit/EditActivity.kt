package com.jgarin.workflow_edit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jgarin.interfaces.analytics.Analytics
import com.jgarin.interfaces.preferences.Preferences
import com.jgarin.workflow_edit.di.EditModuleInternal
import kotlinx.android.synthetic.main.activity_edit.*

class EditActivity : AppCompatActivity() {

    private lateinit var analytics: Analytics
    private lateinit var preferences: Preferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)

        // this will be GCed after this method finishes, so we're not leaking context
        val internalModule = EditModuleInternal(this)

        // we can only use field injection for Activities/Fragments/BroadcastReceivers/Services
        // because Android framework requires them to have empty constructors
        analytics = internalModule.analytics
        preferences = internalModule.preferences

        analytics.log("Main activity created")

        if (savedInstanceState == null) {
            editText.setText(preferences.someValue)
        }

        btnSave.setOnClickListener { preferences.someValue = editText.text.toString() }

    }
}
