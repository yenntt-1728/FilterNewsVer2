package com.example.filternewsver2.ui.module

import com.example.filternewsver2.ui.repository.NewsRepository
import com.example.filternewsver2.ui.repository.NewsRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
abstract class NewsRepositoryModule {
    @Binds
    abstract fun bindsNewsRepository (newsRepositoryImpl: NewsRepositoryImpl) : NewsRepository
}