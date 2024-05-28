package com.example.myapplication.presentation.ui.MainScreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.presentation.adapter.ViewPagerAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewPager = binding.viewPager2
        val adapter = ViewPagerAdapter(this)
        viewPager.adapter = adapter

        binding.previousBtn.setOnClickListener{
            Log.d("previousBtn","pressed!")
            viewPager.currentItem = 0
        }

        binding.nextBtn.setOnClickListener{
            Log.d("nextBtn","pressed!")
            viewPager.currentItem = 1
        }

    }
}