package com.jgarin.serialization

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

// internal implementation
internal class SerializerImpl: JsonSerializer {

    override suspend fun serialize(obj: Any?): String = withContext(Dispatchers.Default) {
        return@withContext "mock json"
    }

    override suspend fun <T> deserialize(json: String, type: Class<T>): T = withContext(Dispatchers.Default){
        TODO("do your thing")
    }
}