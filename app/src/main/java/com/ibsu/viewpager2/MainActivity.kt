package com.ibsu.viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ibsu.viewpager2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
private lateinit var binding: ActivityMainBinding

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    binding = ActivityMainBinding.inflate(layoutInflater)
    val view = binding.root
    setContentView(view)

    val images = listOf(
        R.drawable.image1, R.drawable.image2,
        R.drawable.image3, R.drawable.image4
    )
    val adapter = ViewPagerAdapter(images)
    binding.viewPager.adapter = adapter

    val indicator = binding.indicator
    indicator.setViewPager(binding.viewPager)
}
}