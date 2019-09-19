package com.jgarin.workflow_navigation.di

import android.content.Context
import android.content.Intent
import com.jgarin.workflow_navigation.NavigationActivity

object NavigationModule {

    fun launch(context: Context) {
        val intent = Intent(context, NavigationActivity::class.java)
        context.startActivity(intent)
    }

}