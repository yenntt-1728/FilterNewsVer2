package com.example.filternewsver2.ui.fragment.news

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.filternewsver2.R
import com.example.filternewsver2.databinding.ActivityMainBinding

class NewsFragment : Fragment() {
    private lateinit var newsViewModel : NewsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_news, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    companion object {
        const val TAG = "News"
        val newsInstance = NewsFragment()
    }
}