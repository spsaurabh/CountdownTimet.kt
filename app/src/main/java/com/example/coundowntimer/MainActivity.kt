package com.example.coundowntimer

import android.annotation.SuppressLint
import android.content.IntentSender
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textview: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textview = findViewById(R.id.textview)
        object : CountDownTimer(60000, 1000){
            @SuppressLint("SetTextI18n")
            override fun onTick(milliUnitFinished: Long) {
                textview.text = "00:"+milliUnitFinished/1000
            }
            @SuppressLint("SetTextI18n")
            override fun onFinish() {
                textview.text = "done!"
            }
        }.start()
    }
}