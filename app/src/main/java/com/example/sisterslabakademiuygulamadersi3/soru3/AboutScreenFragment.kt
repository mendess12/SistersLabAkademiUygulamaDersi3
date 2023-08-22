package com.example.sisterslabakademiuygulamadersi3.soru3

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.sisterslabakademiuygulamadersi3.R
import com.example.sisterslabakademiuygulamadersi3.databinding.FragmentAboutScreenBinding

class AboutScreenFragment : Fragment(R.layout.fragment_about_screen) {

    private lateinit var binding: FragmentAboutScreenBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAboutScreenBinding.bind(view)
    }
}