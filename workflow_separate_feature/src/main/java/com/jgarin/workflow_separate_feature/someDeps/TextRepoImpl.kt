package com.jgarin.workflow_separate_feature.someDeps

import android.content.Context
import com.jgarin.interfaces.analytics.Analytics
import com.jgarin.workflow_separate_feature.R

/**
 * Let's pretend we need
 * @param context
 * and
 * @param analytics
 * for the initialization of this class
 */
internal class TextRepoImpl(context: Context, analytics: Analytics) : TextRepo {

    override val textResId: Int = R.string.separate_workflow_text

}