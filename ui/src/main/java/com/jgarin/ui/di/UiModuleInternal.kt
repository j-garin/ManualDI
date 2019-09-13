package com.jgarin.ui.di

import android.content.Context
import com.jgarin.interfaces.analytics.AnalyticsProvider
import com.jgarin.interfaces.base.DiTreeProvider
import com.jgarin.interfaces.preferences.PreferencesProvider

internal class UiModuleInternal(context: Context) :
    AnalyticsProvider by (context.applicationContext as DiTreeProvider).diTree.analyticsProvider,
    PreferencesProvider by (context.applicationContext as DiTreeProvider).diTree.preferencesProvider