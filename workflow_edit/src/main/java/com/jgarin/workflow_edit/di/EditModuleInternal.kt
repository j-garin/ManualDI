package com.jgarin.workflow_edit.di

import android.content.Context
import com.jgarin.interfaces.analytics.AnalyticsProvider
import com.jgarin.interfaces.base.DiTreeProvider
import com.jgarin.interfaces.preferences.PreferencesProvider

internal class EditModuleInternal(context: Context) :
    AnalyticsProvider by (context.applicationContext as DiTreeProvider).diTree,
    PreferencesProvider by (context.applicationContext as DiTreeProvider).diTree