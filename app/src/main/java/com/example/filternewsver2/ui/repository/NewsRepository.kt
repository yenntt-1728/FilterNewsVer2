package com.example.filternewsver2.ui.repository

import com.example.filternewsver2.ui.model.ArticlesResponse

interface NewsRepository {
    suspend fun getListNew(apiKey : String) : ArticlesResponse
}