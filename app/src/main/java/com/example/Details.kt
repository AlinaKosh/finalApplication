package com.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityDetails2Binding
import com.example.myapplication.databinding.ActivityDetailsBinding

class Details : AppCompatActivity() {

    private lateinit var binding : ActivityDetails2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetails2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backStack.setOnClickListener {
            onBackPressed()
        }

        binding.placeMyOrder.setOnClickListener {
            val bottomFragment = SuccessPayment()
            bottomFragment.show(supportFragmentManager, "Test")
        }

        val totalPrice = intent.getStringExtra("totalPrice")
        binding.price.text = totalPrice
    }
}