package com.jgarin.manualdiapplication.entry

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.jgarin.navigation.Navigation

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Handler().postDelayed({ launchNavigationScreen() }, 500)

    }

    private fun launchNavigationScreen() {
        (application as com.jgarin.navigation.Navigation).goToHome(this)
    }
}