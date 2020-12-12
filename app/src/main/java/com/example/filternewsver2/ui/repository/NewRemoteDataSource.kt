package com.example.filternewsver2.ui.repository

import com.example.filternewsver2.ui.model.ArticlesResponse
import com.example.filternewsver2.ui.service.NewsAPI
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NewRemoteDataSource @Inject constructor (private val newsAPI: NewsAPI) {
    suspend fun getListNews(apiKey : String) : ArticlesResponse{
        return newsAPI.getNewsListTop(apiKey)
    }
}