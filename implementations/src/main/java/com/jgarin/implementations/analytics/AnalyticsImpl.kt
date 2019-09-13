package com.jgarin.implementations.analytics

import android.util.Log
import com.jgarin.interfaces.analytics.Analytics

// internal visibility
internal class AnalyticsImpl: Analytics {

    override fun log(message: String) {
        Log.d("example", message) // basic logger as an example
    }

}