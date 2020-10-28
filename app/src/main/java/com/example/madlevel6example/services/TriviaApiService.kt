package com.example.madlevel6example.services

import com.example.madlevel6example.models.Trivia
import retrofit2.http.GET

interface TriviaApiService {

    @GET("/random/trivia?json")
    suspend fun getRandomNumberTrivia(): Trivia

}