package com.example

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.myapplication.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class ActivityMain : AppCompatActivity() {

    private lateinit var buttonNavigationView: BottomNavigationView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        /*
        val bottomNavView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navigationView = findNavController(R.id.fragment_container)

        bottomNavView.setupWithNavController(navigationView)

         */



    }
}
