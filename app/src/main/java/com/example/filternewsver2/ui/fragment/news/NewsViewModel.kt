package com.example.filternewsver2.ui.fragment.news

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.filternewsver2.ui.model.ArticlesResponse
import com.example.filternewsver2.ui.repository.NewsRepository
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class NewsViewModel @ViewModelInject constructor(private val newsRepository: NewsRepository)
    : ViewModel() {

    val news = MutableLiveData<ArticlesResponse>()

    init {
        getListNews()
    }

     private fun getListNews(){
         GlobalScope.launch {
             val dataNews = newsRepository.getListNew(NewsFragment.API_KEY)
             news.postValue(dataNews)
         }
    }

}