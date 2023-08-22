package com.example.sisterslabakademiuygulamadersi3.soru1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.sisterslabakademiuygulamadersi3.R
import com.example.sisterslabakademiuygulamadersi3.databinding.FragmentLoginBinding
import com.google.android.material.snackbar.Snackbar

class LoginFragment : Fragment(R.layout.fragment_login) {

    private lateinit var binding: FragmentLoginBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentLoginBinding.bind(view)

        binding.loginButton.setOnClickListener {
            val userName = binding.userNameEt.text.toString()
            val password = binding.passwordEt.text.toString()

            if (userName.isEmpty() || password.isEmpty()) {
                Snackbar.make(it, "Boş alanları doldurunuz!", Snackbar.LENGTH_SHORT).show()
            } else {
                val action = LoginFragmentDirections.navigateToHomeScreen(userName)
                findNavController().navigate(action)
            }
        }
    }
}