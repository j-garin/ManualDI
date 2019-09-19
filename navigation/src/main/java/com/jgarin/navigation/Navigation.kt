package com.jgarin.navigation

import android.content.Context

interface Navigation {

    fun goToHome(context: Context)

    fun goToEdit(context: Context)

    fun goToSeparate(context: Context)

    fun goToTransitive(context: Context)

}