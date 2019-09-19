package com.jgarin.workflow_separate_feature

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jgarin.workflow_separate_feature.di.FeatureModuleInternal
import kotlinx.android.synthetic.main.activity_feature.*

class SeparateFeatureActivity: AppCompatActivity() {

    private val textResId by lazy { FeatureModuleInternal(this).textRepo.textResId }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature)

        textView.setText(textResId)
    }

}