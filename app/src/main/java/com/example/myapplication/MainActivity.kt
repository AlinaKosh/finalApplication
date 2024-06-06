package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.navigation.ui.setupWithNavController
import com.example.NotificationBottomFragment

//Данный класс важный
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment_container) as NavHostFragment
        val navigationView = navHostFragment.navController
        val notificationBtn = findViewById<ImageView>(R.id.bell_not)

        notificationBtn.setOnClickListener {
            val bottomSheetDialogFragment = NotificationBottomFragment()
            bottomSheetDialogFragment.show(supportFragmentManager, "Test")
        }

        bottomNavView.setupWithNavController(navigationView)
    }
}



