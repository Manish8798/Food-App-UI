package com.example.profustask

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.profustask.databinding.RvItemBinding

class MyAdapter(
    private val dummyData: List<DummyData>
): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    inner class MyViewHolder(private val binding: RvItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(curValue: DummyData) {
            binding.rvItemTv.text = curValue.itemName
            binding.rvImage.setImageResource(curValue.itemImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = RvItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
//        val curName = dummyData[position]
        holder.bind(dummyData[position])

    }

    override fun getItemCount(): Int {
        return dummyData.size
    }

}