package com.example

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.Adapters.CartAdapter
import com.example.Models.PopularModel
import com.example.Models.SharedModel
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentCartBinding


class CartFragment : Fragment() {

    private lateinit var binding : FragmentCartBinding


    private lateinit var adapter : CartAdapter

    private lateinit var sharedModel : SharedModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //sharedModel = ViewModelProvider(requireActivity()).get(SharedModel ::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCartBinding.inflate(inflater, container, false)

        sharedModel = ViewModelProvider(requireActivity()).get(SharedModel ::class.java)

        adapter = CartAdapter(requireContext(), sharedModel.cartItem.value ?: ArrayList())

        binding.cartRv.layoutManager = LinearLayoutManager(requireContext())
        binding.cartRv.adapter = adapter

        binding.proceedBtn.setOnClickListener {
            val totalPrice = sharedModel.cartItem.value?.let { it1 -> colPrice(it1) }
            if (totalPrice == 0) {
                Toast.makeText(requireContext(), "List Is Empty", Toast.LENGTH_SHORT).show()
            }
            val TotalPrice = totalPrice.toString()
            val intent = Intent(requireContext(), Details ::class.java)
            intent.putExtra("totalPrice", TotalPrice)
            startActivity(intent)
        }

        return binding.root
    }

    fun colPrice(itemPrice : List<PopularModel>) : Int {

        var totalPrice = 0

        itemPrice.forEach { itemPrice ->
            val price = itemPrice.getFoodPriceConstant() * itemPrice.getFoodCount()
            totalPrice += price
        }
        return totalPrice
    }


}