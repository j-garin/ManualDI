package com.jgarin.manualdiapplication

import android.content.Context
import com.jgarin.implementations.ImplementationsModule
import com.jgarin.interfaces.AnalyticsProvider
import com.jgarin.interfaces.DiTree
import com.jgarin.interfaces.PreferencesProvider

internal class ApplicationModule(context: Context) : DiTree {

    private val implementationsModule = ImplementationsModule(context)

    override val analyticsProvider: AnalyticsProvider
        get() = implementationsModule
    override val preferencesProvider: PreferencesProvider
        get() = implementationsModule

}