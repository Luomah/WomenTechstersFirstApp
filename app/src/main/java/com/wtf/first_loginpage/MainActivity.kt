package com.wtf.first_loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val join: Button = findViewById(R.id.joinBtn)
        join.setOnClickListener {
            val intent = Intent(this, SecondPageMainActivity2::class.java)

            this.startActivity(intent)
        }


    }
}