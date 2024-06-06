package com.example

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat
import com.example.myapplication.MainActivity
import com.example.myapplication.R
import com.google.android.material.textfield.TextInputLayout

class LocationActivity : AppCompatActivity() {

    private lateinit var autoCompleteTextView: AutoCompleteTextView
    private lateinit var textInputLayout: TextInputLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_location)

        val countryList = arrayOf("Россия", "Бразилия", "Узбекистан", "Португалия")
        val adapter = ArrayAdapter(this@LocationActivity, android.R.layout.simple_dropdown_item_1line, countryList)

        autoCompleteTextView = findViewById(R.id.locationList)
        autoCompleteTextView.setAdapter(adapter)
        autoCompleteTextView.threshold = 1 // Set the minimum number of characters to trigger the dropdown

        textInputLayout = findViewById(R.id.textInputLayout)
        val arrowDownDrawable = ContextCompat.getDrawable(this@LocationActivity, R.drawable.arrow_down)
        textInputLayout.endIconDrawable = arrowDownDrawable

        autoCompleteTextView.setOnClickListener {
            autoCompleteTextView.showDropDown()
        }
        autoCompleteTextView.setOnItemClickListener { parent, view, position, id ->
            val selectedLocation = parent.getItemAtPosition(position) as String
            showDialogAtPosition(selectedLocation)
        }
    }

    fun showDialogAtPosition(location : String){
        val dialogView = layoutInflater.inflate(R.layout.aler_dialog, null)

        val dialogBuilder = AlertDialog.Builder(this@LocationActivity)

        dialogBuilder.setView(dialogView)

        val dialog = dialogBuilder.create()

        dialogView.findViewById<AppCompatButton>(R.id.btn_yes).setOnClickListener {

            startActivityWithLocation(location)
            dialog.dismiss()

        }
        dialog.findViewById<AppCompatButton>(R.id.btn_consel)?.setOnClickListener {
            dialog.dismiss()
        }

        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.show()
    }

    private fun startActivityWithLocation(location: String) {
        val intent = Intent(this@LocationActivity, MainActivity :: class.java)
        intent.putExtra("location", location)
        startActivity(intent)
        finish()
    }
}
