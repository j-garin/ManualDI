package com.jgarin.implementations.analytics.di

import com.jgarin.implementations.analytics.AnalyticsImpl
import com.jgarin.interfaces.analytics.Analytics
import com.jgarin.interfaces.analytics.AnalyticsProvider

// the only class here that has public visiblity
// implementations can be split into multiple modules for better separation
class AnalyticsModule : AnalyticsProvider {

    // this kind of implementation behaves like a singleton. Everyone will receive the same instance
    override val analytics: Analytics = AnalyticsImpl()

}