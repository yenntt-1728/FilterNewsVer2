package com.example.filternewsver2.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.filternewsver2.R
import com.example.filternewsver2.databinding.ActivityMainBinding
import com.example.filternewsver2.ui.fragment.favourite.FavouriteFragment
import com.example.filternewsver2.ui.fragment.news.NewsFragment
import com.example.filternewsver2.ui.fragment.save.SaveFragment
import com.google.android.material.bottomnavigation.BottomNavigationItemView

class MainActivity : AppCompatActivity(), MainListener {
    private lateinit var mainViewModel: MainViewModel
    private lateinit var mainBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = MainViewModel()
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mainBinding.tvTitle.text = resources.getString(R.string.news_title)
        mainBinding.bottomNavigationMain.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.button_news -> setCurrentFragmentAndTitle(NewsFragment.newsInstance, NewsFragment.TAG)
                R.id.button_save -> setCurrentFragmentAndTitle(SaveFragment.saveInstance, SaveFragment.TAG)
                else -> setCurrentFragmentAndTitle(FavouriteFragment.favouriteInstance, FavouriteFragment.TAG)
            }
        }
    }

    override fun showBottomNavigation() {
        TODO("Not yet implemented")
    }

    private fun setCurrentFragmentAndTitle(fragment: Fragment, tag : String?) : Boolean{
        supportFragmentManager.beginTransaction().replace(mainBinding.frameMain.id, fragment, tag).commit()
        mainBinding.tvTitle.text = tag
        return true
    }
}