package com.example.profustask

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.profustask.databinding.ItemViewPagerBinding

class ViewPagerAdapter(
    val images: List<Int>
) : RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>() {

    inner class ViewPagerViewHolder(private val binding: ItemViewPagerBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(curImage: Int) {
            binding.ivImage.setImageResource(curImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view_pager, parent, false)
        val binding = ItemViewPagerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewPagerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        val curImage = images[position]
        holder.bind(curImage)
    }

    override fun getItemCount(): Int {
        return images.size
    }

}