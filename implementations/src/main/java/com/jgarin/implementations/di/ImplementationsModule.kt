package com.jgarin.implementations.di

import android.content.Context
import com.jgarin.implementations.analytics.AnalyticsImpl
import com.jgarin.implementations.preferences.PreferencesImpl
import com.jgarin.interfaces.analytics.Analytics
import com.jgarin.interfaces.analytics.AnalyticsProvider
import com.jgarin.interfaces.preferences.Preferences
import com.jgarin.interfaces.preferences.PreferencesProvider

// the only class here that has public visiblity
// implementations can be split into multiple modules for better separation
class ImplementationsModule(private val context: Context) : AnalyticsProvider,
    PreferencesProvider {

    // this kind of implementation behaves like a singleton. Everyone will receive the same instance
    override val analytics: Analytics = AnalyticsImpl()

    // this implementation creates a new instance every time you get the preferences. Instances will be GCed
    override val preferences: Preferences
        get() = PreferencesImpl(context)

}