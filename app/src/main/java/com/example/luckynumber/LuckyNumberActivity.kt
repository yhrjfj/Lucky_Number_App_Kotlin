package com.example.luckynumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LuckyNumberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lucky_number)

        // Initializing
        val textLNA : TextView = findViewById(R.id.textView2)
        val luckyNumberText : TextView = findViewById(R.id.luckyNumberText)
        val shareButton : Button = findViewById(R.id.share)
    }
}