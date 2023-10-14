package com.example.luckynumber

import android.content.Intent
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

        //luckyNumberText.text = randomNumber.toString()
        luckyNumberText.setText(""+randomNumber)

        // Data sending functionality
        shareButton.setOnClickListener(){
            shareData(receiveUserName, randomNumber)
        }
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

    // Function for sharing information
    private fun shareData(username:String, number:Int){
        //Implicit Intent
        val i = Intent(Intent.ACTION_SEND)
        i.setType("text/plain")
        // Attach information
        i.putExtra(Intent.EXTRA_SUBJECT, "$username is lucky today")
        i.putExtra(Intent.EXTRA_TEXT, "$username\'s lucky number is $number")
        startActivity(i)
    }
}