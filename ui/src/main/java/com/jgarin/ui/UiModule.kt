package com.jgarin.ui

import android.content.Context
import android.content.Intent

class UiModule {

    fun launch(context: Context) {
        val intent = Intent(context, EditActivity::class.java)
        context.startActivity(intent)
    }

}