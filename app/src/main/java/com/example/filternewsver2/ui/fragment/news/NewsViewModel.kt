package com.example.filternewsver2.ui.fragment.news

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.filternewsver2.ui.model.ArticlesResponse
import com.example.filternewsver2.ui.service.NewsRepository
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class NewsViewModel(private val newsRepository: NewsRepository) : ViewModel() {

    val news = MutableLiveData<ArticlesResponse>()

    init {
        getListNews()
    }

     private fun getListNews(){
         GlobalScope.launch {
             val dataNews = newsRepository.getNewsListTop(NewsFragment.API_KEY)
             news.postValue(dataNews)
         }
    }

}