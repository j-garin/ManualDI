package com.jgarin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jgarin.interfaces.Analytics
import com.jgarin.interfaces.DiTreeProvider
import com.jgarin.interfaces.Preferences
import kotlinx.android.synthetic.main.activity_edit.*

class EditActivity : AppCompatActivity() {

    private lateinit var analytics: Analytics
    private lateinit var preferences: Preferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)

        // we can only use field injection for Activities/Fragments/BroadcastReceivers/Services
        // because Android framework requires them to have empty constructors
        analytics = (application as DiTreeProvider).diTree.analyticsProvider.analytics
        preferences = (application as DiTreeProvider).diTree.preferencesProvider.preferences

        analytics.log("Main activity created")

        if (savedInstanceState == null) {
            editText.setText(preferences.someValue)
        }

        btnSave.setOnClickListener { preferences.someValue = editText.text.toString() }

    }
}
