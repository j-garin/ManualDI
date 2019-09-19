package com.jgarin.workflow_transitive_dependency

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jgarin.workflow_transitive_dependency.di.TransitiveWorkflowModuleInternal
import kotlinx.android.synthetic.main.activity_transitive_dependency.*
import kotlinx.coroutines.*

class TransitiveDependencyActivity : AppCompatActivity() {

    private val repo by lazy { TransitiveWorkflowModuleInternal(this).repo }

    private val uiScope = CoroutineScope(Dispatchers.Main + SupervisorJob())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transitive_dependency)

        uiScope.launch {
            textView.text = repo.getSomeStuff().joinToString()
        }

    }

    override fun onStop() {
        uiScope.coroutineContext.cancelChildren()
        super.onStop()
    }

}