package com.example.filternewsver2.ui.service

import com.example.filternewsver2.ui.model.ArticlesResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {
    @GET("/v2/top-headlines?sources=google-news")
    suspend fun getNewsListTop(@Query("apiKey") apiKey: String): ArticlesResponse

    @GET("/v2/everything")
    suspend fun getNewsListSearch(@Query("q") keySearch : String, @Query("apiKey") apiKey : String)
            : ArticlesResponse
}