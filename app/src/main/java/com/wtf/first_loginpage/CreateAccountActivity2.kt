package com.wtf.first_loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CreateAccountActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account2)
        val signUp: Button = findViewById(R.id.signUpButton)
        signUp.setOnClickListener {
            val intent = Intent(this, SecondPageMainActivity2::class.java)

            this.startActivity(intent)
        }
    }
}