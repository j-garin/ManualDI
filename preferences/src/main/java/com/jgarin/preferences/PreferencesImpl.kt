package com.jgarin.preferences

import android.content.Context
import android.preference.PreferenceManager
import com.jgarin.interfaces.preferences.Preferences

// internal visibility
internal class PreferencesImpl(context: Context): Preferences {

    private val preferences = PreferenceManager.getDefaultSharedPreferences(context)

    override var someValue: String = preferences.getString(someValueKey, "") ?: ""
        set(value) {
            field = value
            preferences.edit().putString(someValueKey, value).apply() // saved in background
        }

    companion object {
        // private visibility
        private const val someValueKey = "someValueKey"

    }

}