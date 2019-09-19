package com.jgarin.api.di

import android.content.Context
import com.jgarin.api.Api
import com.jgarin.api.ApiImpl
import com.jgarin.serialization.di.SerializerModule

class ApiModule(context: Context) {

    private val serializer = SerializerModule(context).serializer

    /**
     * If you want this as a singleton, see [FeatureModuleInternal] for example.
     * This implementation will create a new instance with every [ApiModule] instance
      */
    val api: Api = ApiImpl(serializer)

}