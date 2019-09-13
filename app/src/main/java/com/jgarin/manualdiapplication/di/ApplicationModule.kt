package com.jgarin.manualdiapplication.di

import android.content.Context
import com.jgarin.implementations.di.ImplementationsModule
import com.jgarin.interfaces.analytics.AnalyticsProvider
import com.jgarin.interfaces.base.DiTree
import com.jgarin.interfaces.preferences.PreferencesProvider

// internal visibility
internal class ApplicationModule(context: Context) : DiTree {

    private val implementationsModule = ImplementationsModule(context)

    // delegates singleton behaviour to implementations module
    // doesn't matter if you use [get] or not
    override val analyticsProvider: AnalyticsProvider
        get() = implementationsModule
    override val preferencesProvider: PreferencesProvider
        get() = implementationsModule

}