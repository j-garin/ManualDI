package com.jgarin.api

interface Api {

    suspend fun getSomeStuff(): List<String>

}