package com.example.filternewsver2.ui.repository

import com.example.filternewsver2.ui.model.ArticlesResponse
import javax.inject.Inject


class NewsRepositoryImpl @Inject constructor(private val newRemoteDataSource : NewRemoteDataSource)
    : NewsRepository {
    override suspend fun getListNew(apiKey : String) : ArticlesResponse{
        return newRemoteDataSource.getListNews(apiKey)
    }
}