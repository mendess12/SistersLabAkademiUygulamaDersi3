package com.example.sisterslabakademiuygulamadersi3.soru3

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.sisterslabakademiuygulamadersi3.R
import com.example.sisterslabakademiuygulamadersi3.databinding.FragmentHomeScreenBinding

class HomeScreenFragment : Fragment(R.layout.fragment_home_screen) {

    private lateinit var binding: FragmentHomeScreenBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeScreenBinding.bind(view)
    }
}