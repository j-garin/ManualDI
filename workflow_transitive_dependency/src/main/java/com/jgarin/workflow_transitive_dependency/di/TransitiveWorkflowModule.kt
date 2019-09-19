package com.jgarin.workflow_transitive_dependency.di

import android.content.Context
import android.content.Intent
import com.jgarin.workflow_transitive_dependency.TransitiveDependencyActivity

object TransitiveWorkflowModule {

    fun launch(context: Context) {
        val intent = Intent(context, TransitiveDependencyActivity::class.java)
        context.startActivity(intent)
    }

}