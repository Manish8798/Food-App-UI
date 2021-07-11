package com.example.profustask

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.profustask.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private lateinit var dummyData: DummyData

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        val adapter = ViewPagerAdapter(dummyImages())
        binding.viewPager.adapter = adapter

        binding.apply {
            recyclerView.adapter = MyAdapter(dummyNames())
        }

        return binding.root
    }

    private fun dummyImages(): List<Int> {
        return listOf(
            R.drawable.food_image1,
            R.drawable.food_image2,
            R.drawable.food_image3,
            R.drawable.food_image4)
    }

    private fun dummyNames(): List<DummyData> {
        return listOf(DummyData("food item1", R.drawable.grocery_image1),
        DummyData("food item2", R.drawable.grocery_image1),
        DummyData("food item3", R.drawable.grocery_image1),
        DummyData("food item4", R.drawable.grocery_image1),
        DummyData("food item5", R.drawable.grocery_image1),
        DummyData("food item6", R.drawable.grocery_image1)
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}