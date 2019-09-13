package com.jgarin.interfaces.base

import com.jgarin.interfaces.analytics.AnalyticsProvider
import com.jgarin.interfaces.preferences.PreferencesProvider

// this whole module contains only interfaces without any implementations
// can be split into multiple modules depending on the scopes we need
interface DiTree {

    val analyticsProvider: AnalyticsProvider

    val preferencesProvider: PreferencesProvider

}