package com.example.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.Models.PopularModel
import com.example.myapplication.databinding.ByAgainItemBinding

class ByAgainAdapter(
    private val context: Context,
    private val buyList: ArrayList<PopularModel>
) : RecyclerView.Adapter<ByAgainAdapter.BuyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BuyViewHolder {

        val binding = ByAgainItemBinding.inflate(LayoutInflater.from(context), parent, false)

        return BuyViewHolder(binding)

    }

    override fun getItemCount(): Int {
        return buyList.size
    }

    override fun onBindViewHolder(holder: BuyViewHolder, position: Int) {

        val list = buyList[position]
        list.getFoodImage()?.let { holder.foodImage.setImageResource(it) }
        holder.foodName.text = list.getFoodName()
        holder.foodPrice.text = list.getFoodPrice().toString()

    }

    class BuyViewHolder(private val binding: ByAgainItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        val foodName = binding.buyFoodName
        val foodImage = binding.buyFoodImage
        val foodPrice = binding.buyFoodPrice

    }
}