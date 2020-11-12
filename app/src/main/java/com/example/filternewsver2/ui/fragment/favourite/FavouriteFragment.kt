package com.example.filternewsver2.ui.fragment.favourite

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.filternewsver2.R
import com.example.filternewsver2.ui.fragment.save.SaveFragment

class FavouriteFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_favourite, container, false)
    }

    companion object {
        const val TAG = "Favourite"
        val favouriteInstance = FavouriteFragment()
    }
}