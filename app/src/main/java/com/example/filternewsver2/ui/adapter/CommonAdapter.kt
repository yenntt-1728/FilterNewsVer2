package com.example.filternewsver2.ui.adapter

import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

abstract class CommonAdapter<T> : RecyclerView.Adapter<DataBoundViewHolder<ViewDataBinding>>() {

    var items: MutableList<T> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataBoundViewHolder<ViewDataBinding> {
        val binding = createBinding(parent)
        return DataBoundViewHolder(binding)
    }

    protected abstract fun createBinding(parent: ViewGroup): ViewDataBinding

    override fun onBindViewHolder(holder: DataBoundViewHolder<ViewDataBinding>, position: Int) {
        bind(holder.binding, items[position])
        holder.binding.executePendingBindings()
    }

    protected abstract fun bind(binding: ViewDataBinding, item: T)

    override fun getItemCount(): Int {
        return items.size
    }
}