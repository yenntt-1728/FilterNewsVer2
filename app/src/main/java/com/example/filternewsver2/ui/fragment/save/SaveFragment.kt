package com.example.filternewsver2.ui.fragment.save

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.filternewsver2.R

class SaveFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_save, container, false)
    }

    companion object {
        const val TAG = "Save"
        val saveInstance = SaveFragment()
    }
}