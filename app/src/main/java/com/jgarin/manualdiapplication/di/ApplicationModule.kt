package com.jgarin.manualdiapplication.di

import android.content.Context
import com.jgarin.implementations.analytics.di.AnalyticsModule
import com.jgarin.implementations.analytics.di.PreferencesModule
import com.jgarin.interfaces.analytics.AnalyticsProvider
import com.jgarin.interfaces.base.DiTree
import com.jgarin.interfaces.preferences.PreferencesProvider

// internal visibility
internal class ApplicationModule(context: Context) : DiTree,
    // we can use delegation here
    AnalyticsProvider by AnalyticsModule(),
    PreferencesProvider by PreferencesModule(context)