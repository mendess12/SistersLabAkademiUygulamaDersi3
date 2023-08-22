package com.example.sisterslabakademiuygulamadersi3.soru3

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.sisterslabakademiuygulamadersi3.R
import com.example.sisterslabakademiuygulamadersi3.databinding.FragmentSettingsScreenBinding

class SettingsScreenFragment : Fragment(R.layout.fragment_settings_screen) {

    private lateinit var binding: FragmentSettingsScreenBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSettingsScreenBinding.bind(view)
    }
}