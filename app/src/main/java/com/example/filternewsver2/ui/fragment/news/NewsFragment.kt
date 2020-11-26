package com.example.filternewsver2.ui.fragment.news

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.example.filternewsver2.ui.service.NewsRepository
import com.example.filternewsver2.R
import com.example.filternewsver2.databinding.FragmentNewsBinding
import com.example.filternewsver2.ui.adapter.NewsAdapter
import com.example.filternewsver2.ui.model.News

class NewsFragment : Fragment() {
    private lateinit var newsViewModel : NewsViewModel
    private val newAdapter by lazy {
        NewsAdapter<News>(layoutInflater, R.layout.item_news).apply {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_news, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        context?.apply {
            val newsRepository = NewsRepository(this)
            newsViewModel = NewsViewModel(newsRepository)
        }
        val newBinding : FragmentNewsBinding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_news,
            null, false)
        newBinding.adapter = newAdapter
        handleObservable()
    }

    private fun handleObservable(){
        newsViewModel.news.observe(viewLifecycleOwner, Observer {
            // TODO
        })
    }

    companion object {
        const val TAG = "News"
        const val API_KEY = "7257ad280bbe43a5a69295e4a85ea66a"
        val newsInstance = NewsFragment()
    }
}