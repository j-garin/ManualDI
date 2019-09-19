package com.jgarin.navigation

import android.app.Activity

val Activity.navigation: Navigation
    get() = this.applicationContext as Navigation