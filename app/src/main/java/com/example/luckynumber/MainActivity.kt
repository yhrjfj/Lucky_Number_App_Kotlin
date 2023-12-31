package com.example.luckynumber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initializing
        val text : TextView = findViewById(R.id.textView)
        val name : EditText = findViewById(R.id.editText)
        val findLuckyNUmberButton : Button = findViewById(R.id.btn)

        // Button
        findLuckyNUmberButton.setOnClickListener(){
            var username = name.text

            //Explicit Intents
            var i : Intent = Intent(this, LuckyNumberActivity::class.java)

            //Passing user name
            i.putExtra("name", username)
            startActivity(i)
        }
    }
}