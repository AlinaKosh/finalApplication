package com.example

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import com.example.myapplication.MainActivity
import com.example.myapplication.R

class LoginUserActivity : AppCompatActivity() {

    private lateinit var goRegistrationPage: TextView
    private lateinit var goButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_user)

        goRegistrationPage = findViewById(R.id.go_sign_up_user)

        goRegistrationPage.setOnClickListener {
            val intent = Intent(this@LoginUserActivity, SingUpUserActivity::class.java)
            startActivity(intent)
        }

        goButton = findViewById(R.id.button3)
        goButton.setOnClickListener {
            val intent = Intent(this@LoginUserActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
