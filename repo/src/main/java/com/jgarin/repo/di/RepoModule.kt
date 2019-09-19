package com.jgarin.repo.di

import android.content.Context
import com.jgarin.api.di.ApiModule
import com.jgarin.repo.Repo
import com.jgarin.repo.RepoImpl

class RepoModule(context: Context) {

    private val api = ApiModule(context).api

    val repo: Repo = RepoImpl(api)

}