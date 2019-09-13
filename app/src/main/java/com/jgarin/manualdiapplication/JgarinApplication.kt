package com.jgarin.manualdiapplication

import android.app.Application
import com.jgarin.interfaces.DiTree
import com.jgarin.interfaces.DiTreeProvider

class JgarinApplication : Application(), DiTreeProvider {

    private lateinit var diTreeImpl: DiTree

    override val diTree: DiTree
        get() = diTreeImpl

    override fun onCreate() {
        super.onCreate()

        diTreeImpl = ApplicationModule(context = this)

    }

}