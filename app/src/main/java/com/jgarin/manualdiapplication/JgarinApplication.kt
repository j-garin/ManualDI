package com.jgarin.manualdiapplication

import android.app.Application
import com.jgarin.interfaces.base.DiTree
import com.jgarin.interfaces.base.DiTreeProvider
import com.jgarin.manualdiapplication.di.ApplicationModule

// main application class. this is the only code needed to get the di running
class JgarinApplication : Application(), DiTreeProvider {

    private lateinit var diTreeImpl: DiTree

    override val diTree: DiTree
        get() = diTreeImpl

    override fun onCreate() {
        super.onCreate()

        diTreeImpl = ApplicationModule(context = this)

    }

}