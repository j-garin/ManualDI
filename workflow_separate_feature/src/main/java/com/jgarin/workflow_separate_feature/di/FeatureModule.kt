package com.jgarin.workflow_separate_feature.di

import android.content.Context
import android.content.Intent
import com.jgarin.workflow_separate_feature.SeparateFeatureActivity

object FeatureModule {

    fun launch(context: Context) {
        val intent = Intent(context, SeparateFeatureActivity::class.java)
        context.startActivity(intent)
    }

}