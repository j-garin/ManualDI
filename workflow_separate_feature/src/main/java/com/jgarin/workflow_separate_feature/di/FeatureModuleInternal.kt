package com.jgarin.workflow_separate_feature.di

import android.content.Context
import com.jgarin.interfaces.base.DiTreeProvider
import com.jgarin.workflow_separate_feature.someDeps.TextRepo
import com.jgarin.workflow_separate_feature.someDeps.TextRepoImpl

/** This is not a singleton, so we're not actually leaking
 * @param context
 */
internal class FeatureModuleInternal(private val context: Context) {

    /**
     * This one is actually a singleton. We don't save the context internally, but may use it
     * for initialization
     */
    val textRepo: TextRepo
        get() {
            val initializedRepo = repo ?: let {
                // we have the ocntext, so we can easily fetch stuff from DiTree
                val analytics = (context.applicationContext as DiTreeProvider).diTree.analytics
                TextRepoImpl(context, analytics)
            }
            repo = initializedRepo
            return initializedRepo
        }

    val someOtherDependency: String
        get() = "This one is not a singleton, new instance will be created with every get call"

    companion object {
        private var repo: TextRepo? = null
    }

}