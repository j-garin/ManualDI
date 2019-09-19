package com.jgarin.manualdiapplication

import android.app.Application
import com.jgarin.interfaces.base.DiTree
import com.jgarin.interfaces.base.DiTreeProvider
import com.jgarin.navigation.Navigation
import com.jgarin.manualdiapplication.di.ApplicationModule
import com.jgarin.manualdiapplication.di.NavigationModuleInternal

// main application class. this is the only code needed to get the di running
class JgarinApplication : Application(), DiTreeProvider, Navigation by NavigationModuleInternal() {

    private lateinit var diTreeImpl: DiTree

    override val diTree: DiTree
        get() = diTreeImpl

    override fun onCreate() {
        super.onCreate()

        diTreeImpl = ApplicationModule(context = this)

    }

}