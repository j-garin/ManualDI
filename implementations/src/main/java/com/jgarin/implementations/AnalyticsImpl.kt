package com.jgarin.implementations

import android.util.Log
import com.jgarin.interfaces.Analytics

// internal visibility
internal class AnalyticsImpl: Analytics {

    override fun log(message: String) {
        Log.d("example", message)
    }

}