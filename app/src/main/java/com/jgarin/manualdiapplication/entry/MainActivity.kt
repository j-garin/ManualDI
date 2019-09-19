package com.jgarin.manualdiapplication.entry

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.jgarin.navigation.navigation

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Handler().postDelayed({ launchNavigationScreen() }, 500)

    }

    private fun launchNavigationScreen() {
        navigation.goToHome(this)
    }
}