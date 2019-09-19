package com.jgarin.serialization.di

import android.content.Context
import com.jgarin.serialization.JsonSerializer
import com.jgarin.serialization.SerializerImpl

/**
 * Imagine we need context here or any other dependency because we can literally get anything else
 * from [DiTree] just by having context
 */
class SerializerModule(context: Context) {

    val serializer: JsonSerializer = SerializerImpl()

}