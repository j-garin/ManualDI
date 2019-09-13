package com.jgarin.implementations

import android.content.Context
import android.preference.PreferenceManager
import com.jgarin.interfaces.Preferences

// internal visibility
internal class PreferencesImpl(context: Context): Preferences {

    private val preferences = PreferenceManager.getDefaultSharedPreferences(context)

    override var someValue: String = preferences.getString(someValueKey, "") ?: ""
        set(value) {
            field = value
            preferences.edit().putString(someValueKey, value).apply()
        }

    companion object {
        private const val someValueKey = "someValueKey"

    }

}