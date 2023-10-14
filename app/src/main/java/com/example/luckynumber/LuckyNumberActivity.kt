package com.example.luckynumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class LuckyNumberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lucky_number)

        // Initializing
        val textLNA : TextView = findViewById(R.id.textView2)
        val luckyNumberText : TextView = findViewById(R.id.luckyNumberText)
        val shareButton : Button = findViewById(R.id.share)

        // Receive data
        var receiveUserName = receiveUserName()

        // Random number
        var randomNumber = randomNumberGenerator()

        // 1st way to show random number
        // luckyNumberText.text = randomNumber.toString()

        // 2nd way for showning random number
        luckyNumberText.setText(""+randomNumber)
    }

    // Function for receive data
    private fun receiveUserName():String{
        var bundle : Bundle? = intent.extras
        var username = bundle?.get("name").toString()
        return username
    }

    // Random number generator
    private fun randomNumberGenerator() : Int{
        val random = Random.nextInt(0,1000)
        return random
    }
}