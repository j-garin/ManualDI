package com.jgarin.repo

interface Repo {

    suspend fun getSomeStuff(): List<String>

}