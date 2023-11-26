package com.wtf.first_loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class ForgotPasswordActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password2)

        val login: Button = findViewById(R.id.login)
        val sendBtn: Button = findViewById(R.id.send)
        val emailEdt: EditText = findViewById(R.id.email)

        login.setOnClickListener {

            val intent = Intent(this, SecondPageMainActivity2::class.java)

            this.startActivity(intent)
        }


        sendBtn.setOnClickListener {
            val userEmailEntered: String= emailEdt.text.toString()
            var message = "";
            if(userEmailEntered.isEmpty()){
                message = "You need to input an Email Address";
            }else{
                        val i = Intent(this, HomeActivity2:: class.java)
                        startActivity(i)
                    }
                }


            Snackbar
                .make(
                    findViewById(R.id.layout),
                    "An Email has been sent to ",
                    Snackbar.LENGTH_LONG
                )
                .show()
        }




    }
