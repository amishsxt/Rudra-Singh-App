package com.example.myapplication.presentation.ui.MainScreen.Frags

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentHorseBinding


class HorseFragment : Fragment() {

    private lateinit var binding: FragmentHorseBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHorseBinding.inflate(layoutInflater)
        return binding.root
    }
}