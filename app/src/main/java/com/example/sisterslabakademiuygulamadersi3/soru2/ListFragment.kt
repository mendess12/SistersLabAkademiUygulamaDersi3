package com.example.sisterslabakademiuygulamadersi3.soru2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sisterslabakademiuygulamadersi3.R
import com.example.sisterslabakademiuygulamadersi3.databinding.FragmentListBinding

class ListFragment : Fragment(R.layout.fragment_list) {

    private lateinit var binding: FragmentListBinding
    private lateinit var cryptoAdapter: CryptoAdapter
    private lateinit var cryptoList: ArrayList<Crypto>

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentListBinding.bind(view)

        binding.rv.setHasFixedSize(true)
        binding.rv.layoutManager = LinearLayoutManager(requireContext())
        addCrypto()
    }

    fun addCrypto() {
        val crypto1 = Crypto("BTC")
        val crypto2 = Crypto("CYBER")
        val crypto3 = Crypto("XRP")
        val crypto4 = Crypto("SHIB")
        val crypto5 = Crypto("SEI")
        val crypto6 = Crypto("ETHEREUM")
        val crypto7 = Crypto("XRP")
        val crypto8 = Crypto("PEPE")
        val crypto9 = Crypto("POLYGON")
        val crypto10 = Crypto("BNB")
        val crypto11 = Crypto("LIDO DAO")
        val crypto12 = Crypto("LEVERFI")
        val crypto13 = Crypto("ACROPOLICE")

        cryptoList = ArrayList<Crypto>()
        cryptoList.add(crypto1)
        cryptoList.add(crypto2)
        cryptoList.add(crypto3)
        cryptoList.add(crypto4)
        cryptoList.add(crypto5)
        cryptoList.add(crypto6)
        cryptoList.add(crypto7)
        cryptoList.add(crypto8)
        cryptoList.add(crypto9)
        cryptoList.add(crypto10)
        cryptoList.add(crypto11)
        cryptoList.add(crypto12)
        cryptoList.add(crypto13)

        cryptoAdapter = CryptoAdapter(cryptoList)
        binding.rv.adapter = cryptoAdapter
    }
}