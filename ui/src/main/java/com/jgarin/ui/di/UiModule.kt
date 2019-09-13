package com.jgarin.ui.di

import android.content.Context
import android.content.Intent
import com.jgarin.ui.EditActivity

class UiModule {

    fun launch(context: Context) {
        val intent = Intent(context, EditActivity::class.java)
        context.startActivity(intent)
    }

}