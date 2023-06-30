package com.ibsu.viewpager2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ibsu.viewpager2.databinding.ItemViewPagerBinding

class ViewPagerAdapter(private val Images: List<Int>) :
    RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>() {
    inner class ViewPagerViewHolder(val binding: ItemViewPagerBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemViewPagerBinding.inflate(inflater, parent, false)
        return ViewPagerViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return Images.size
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        val currentImage = Images[position]
        // Use the binding instance to access views and set data
        holder.binding.imageView.setImageResource(currentImage)
    }
}