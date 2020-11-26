package com.example.filternewsver2.ui.view

import androidx.appcompat.widget.AppCompatImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("bindImageUrl")
fun AppCompatImageView.loadImage(url: String?) {
    Glide.with(this.context)
        .load(url)
        .skipMemoryCache(true)
        .fitCenter()
        .into(this)
}