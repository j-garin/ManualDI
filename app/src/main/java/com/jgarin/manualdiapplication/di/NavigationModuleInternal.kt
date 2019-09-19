package com.jgarin.manualdiapplication.di

import android.content.Context
import com.jgarin.navigation.Navigation
import com.jgarin.workflow_edit.di.EditModule
import com.jgarin.workflow_navigation.di.NavigationModule
import com.jgarin.workflow_separate_feature.di.FeatureModule
import com.jgarin.workflow_transitive_dependency.di.TransitiveWorkflowModule

internal class NavigationModuleInternal: Navigation {

    override fun goToHome(context: Context) {
        NavigationModule.launch(context)
    }

    override fun goToEdit(context: Context) {
        EditModule.launch(context)
    }

    override fun goToSeparate(context: Context) {
        FeatureModule.launch(context)
    }

    override fun goToTransitive(context: Context) {
        TransitiveWorkflowModule.launch(context)
    }
}