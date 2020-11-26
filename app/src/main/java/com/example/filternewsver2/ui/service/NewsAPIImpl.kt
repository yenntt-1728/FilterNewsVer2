package com.example.filternewsver2.ui.service

import com.example.filternewsver2.ui.model.ArticlesResponse

interface NewsAPIImpl {
    suspend fun getNewsListTop(apiKey : String) : ArticlesResponse
    suspend fun getNewsListSearch(keySearch : String, apiKey : String) : ArticlesResponse
}