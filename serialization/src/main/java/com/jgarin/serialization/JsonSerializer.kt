package com.jgarin.serialization

//public interface
interface JsonSerializer {

    suspend fun serialize(obj: Any?): String

    suspend fun <T>deserialize(json: String, type: Class<T>): T

}