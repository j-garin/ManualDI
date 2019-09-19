package com.jgarin.repo

import com.jgarin.api.Api
import kotlinx.coroutines.delay

internal class RepoImpl(private val api: Api): Repo {

    override suspend fun getSomeStuff(): List<String> {
        val someStuff = api.getSomeStuff()
        delay(100) // save this to cache or something
        return someStuff
    }

}