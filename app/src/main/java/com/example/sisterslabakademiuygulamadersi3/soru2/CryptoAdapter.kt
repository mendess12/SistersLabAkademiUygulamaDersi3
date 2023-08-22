package com.example.sisterslabakademiuygulamadersi3.soru2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.sisterslabakademiuygulamadersi3.databinding.CardItemBinding

class CryptoAdapter(private val cryptoList: List<Crypto>) :
    RecyclerView.Adapter<CryptoAdapter.CryptoViewHolder>() {

    inner class CryptoViewHolder(val binding: CardItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CryptoViewHolder {
        val binding = CardItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CryptoViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return cryptoList.size
    }

    override fun onBindViewHolder(holder: CryptoViewHolder, position: Int) {
        val crypto = cryptoList[position]
        val binding = holder.binding
        binding.cardTv.text = crypto.cryptoName

        binding.cardNextIv.setOnClickListener {
            val action = ListFragmentDirections.navigateToDetailScreen(crypto.cryptoName)
            Navigation.findNavController(it).navigate(action)
        }
    }
}