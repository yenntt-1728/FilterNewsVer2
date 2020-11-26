package com.example.filternewsver2.ui.service

import android.content.Context
import okhttp3.Cache
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

open class NewsApiClient {
    fun <T> createService(
        context: Context,
        endPoint: String?,
        serviceClass: Class<T>?): T {
        val httpClientBuilder = OkHttpClient.Builder()
        val cacheSize = 10 * 1024 * 1024
        httpClientBuilder.cache(
            Cache(
                context.applicationContext.cacheDir,
                cacheSize.toLong()
            )
        )
        val retrofit = Retrofit.Builder().baseUrl(endPoint)
            .client(httpClientBuilder.build())
            .addConverterFactory(ScalarsConverterFactory.create())
            .build()
        return retrofit.create(serviceClass)
    }
}