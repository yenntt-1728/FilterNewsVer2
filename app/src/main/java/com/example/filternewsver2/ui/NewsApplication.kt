package com.example.filternewsver2.ui

import android.app.Application
import com.example.filternewsver2.ui.module.NewApiModule
import com.example.filternewsver2.ui.module.NewsRepositoryModule
import com.example.filternewsver2.ui.service.NewsAPI
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class NewsApplication : Application() {

}