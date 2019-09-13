package com.jgarin.implementations

import android.content.Context
import com.jgarin.interfaces.Analytics
import com.jgarin.interfaces.AnalyticsProvider
import com.jgarin.interfaces.Preferences
import com.jgarin.interfaces.PreferencesProvider

// the only class here that has public visiblity
class ImplementationsModule(private val context: Context) : AnalyticsProvider, PreferencesProvider {

    override val analytics: Analytics = AnalyticsImpl()

    override val preferences: Preferences
        get() = PreferencesImpl(context)

}