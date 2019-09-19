package com.jgarin.api

import com.jgarin.serialization.JsonSerializer
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

internal class ApiImpl(private val serializer: JsonSerializer): Api {

    override suspend fun getSomeStuff(): List<String> = withContext(Dispatchers.IO){
        // emulate actual api call
        delay(1000)
        return@withContext listOf("one", "two", "three")
    }
}