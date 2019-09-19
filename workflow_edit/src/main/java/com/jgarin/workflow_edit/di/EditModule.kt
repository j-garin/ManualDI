package com.jgarin.workflow_edit.di

import android.content.Context
import android.content.Intent
import com.jgarin.workflow_edit.EditActivity

object EditModule {

    fun launch(context: Context) {
        val intent = Intent(context, EditActivity::class.java)
        context.startActivity(intent)
    }

}