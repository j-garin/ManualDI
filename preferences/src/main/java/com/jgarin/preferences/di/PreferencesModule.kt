package com.jgarin.implementations.analytics.di

import android.content.Context
import com.jgarin.interfaces.preferences.Preferences
import com.jgarin.interfaces.preferences.PreferencesProvider

// the only class here that has public visiblity
// implementations can be split into multiple modules for better separation
class PreferencesModule(private val context: Context) : PreferencesProvider {

    // this implementation creates a new instance every time you get the preferences. Instances will be GCed
    override val preferences: Preferences
        get() = com.jgarin.preferences.PreferencesImpl(context)

}