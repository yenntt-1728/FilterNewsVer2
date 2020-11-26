package com.example.filternewsver2.ui.model

import com.example.filternewsver2.ui.model.News
import com.squareup.moshi.Json

data class ArticlesResponse(
    @Json(name = "status")
    val status : String? = null,
    @Json(name = "totalResults")
    val totalResults: Int? = null,
    @Json(name = "articles")
    val articles : List<News> = mutableListOf()
)