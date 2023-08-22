package com.example.sisterslabakademiuygulamadersi3.soru1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.navArgs
import com.example.sisterslabakademiuygulamadersi3.R
import com.example.sisterslabakademiuygulamadersi3.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var binding : FragmentHomeBinding
    private val args : HomeFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)

        binding.homeTv.text = "Hoş geldin ${args.userName}"

    }

}