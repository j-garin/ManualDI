package com.jgarin.navigation

import android.content.Context

class NavigationModule(context: Context) :
        Navigation by context.applicationContext as Navigation