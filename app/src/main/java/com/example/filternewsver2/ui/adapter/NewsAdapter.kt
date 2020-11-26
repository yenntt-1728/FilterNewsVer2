package com.example.filternewsver2.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.databinding.library.baseAdapters.BR

class NewsAdapter<T>(private val inflater: LayoutInflater, private val layoutId: Int) : CommonAdapter<T>() {

    var listener: SimpleDataBoundItemListener? = null

    fun getData() = items

    fun setData(items: MutableList<T>) {
        this.items = items
        notifyDataSetChanged()
    }

    override fun createBinding(parent: ViewGroup): ViewDataBinding {
        return DataBindingUtil.inflate(inflater, layoutId, parent, false)
    }

    override fun bind(binding: ViewDataBinding, item: T) {
        binding.apply {
            setVariable(BR.viewModel, item)
            listener?.let {
                setVariable(BR.listener, it)
            }
            executePendingBindings()
        }
    }
}

interface SimpleDataBoundItemListener