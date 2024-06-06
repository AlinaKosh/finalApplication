package com.example

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import com.example.myapplication.R

class SingUpUserActivity : AppCompatActivity() {

    private lateinit var goLoginPage: TextView
    private lateinit var goButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_up_user)

        goLoginPage = findViewById(R.id.go_login_user_page)

        goLoginPage.setOnClickListener {
            val intent = Intent(this@SingUpUserActivity, LoginUserActivity :: class.java)
            startActivity(intent)
        }

        goButton = findViewById(R.id.button3)
        goButton.setOnClickListener {
            val intent = Intent(this@SingUpUserActivity, LocationActivity :: class.java)
            startActivity(intent)
            finish()
        }


    }
}