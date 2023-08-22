package com.example.sisterslabakademiuygulamadersi3.soru3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.sisterslabakademiuygulamadersi3.R
import com.example.sisterslabakademiuygulamadersi3.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {

    private lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        /*
        * Navigation Graph oluşturarak "Anasayfa", "Hakkında" ve "Ayarlar"  sahip bir
        * gezinme yapısı oluşturun. Anasayfa'dan diğer sayfalara geçiş yapılmasını sağlayın.(Bottom Navigation)
        * */

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment_three) as NavHostFragment
        NavigationUI.setupWithNavController(
            binding.bottomNavigationView,
            navHostFragment.navController
        )
    }
}