package com.jgarin.workflow_transitive_dependency.di

import android.content.Context
import android.content.Intent
import com.jgarin.repo.Repo
import com.jgarin.repo.di.RepoModule
import com.jgarin.workflow_transitive_dependency.TransitiveDependencyActivity

internal class TransitiveWorkflowModuleInternal(private val context: Context) {

    val repo: Repo
        get() {
            val nonNullRepo = repoSingleton ?: RepoModule(context).repo
            repoSingleton = nonNullRepo
            return nonNullRepo
        }

    companion object {
        private var repoSingleton: Repo? = null
    }

}