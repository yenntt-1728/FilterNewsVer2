package com.example.filternewsver2.ui.service

import android.content.Context
import com.example.filternewsver2.ui.model.ArticlesResponse

//no need
class NewsRepository(private val context: Context) : NewsAPIImpl {
    private val apiNews : NewsAPI = NewsApiInstance.getInstance().newInstance(context)
    override suspend fun getNewsListTop(apiKey: String): ArticlesResponse {
        return apiNews.getNewsListTop(apiKey)
    }

    override suspend fun getNewsListSearch(
        keySearch: String,
        apiKey: String
    ): ArticlesResponse {
        return apiNews.getNewsListSearch(keySearch, apiKey)
    }
}