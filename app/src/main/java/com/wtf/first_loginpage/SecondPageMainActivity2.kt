package com.wtf.first_loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class SecondPageMainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page_main2)
        val createAccount: Button = findViewById(R.id.createAccount)
        val forgetPassword: Button = findViewById(R.id.forgottenPassword)

        val loginBtn: Button = findViewById(R.id.login)
        val usernameEdt: EditText= findViewById(R.id.username)
        val passwordEdt: EditText = findViewById(R.id.password)

        createAccount.setOnClickListener {
            val intent = Intent(this, CreateAccountActivity2::class.java)

            this.startActivity(intent)
        }

        forgetPassword.setOnClickListener {
            val intent = Intent(this, ForgotPasswordActivity2::class.java)

            this.startActivity(intent)
        }

        loginBtn.setOnClickListener{
            val userUsernameEntered: String = usernameEdt.text.toString()
            val userPasswordEntered: String = passwordEdt.text.toString()
            var message = "";
            if(userUsernameEntered.isEmpty() && userPasswordEntered.isEmpty()){
                message = "You need to input a username and password";
            }else{
                if(userUsernameEntered.isEmpty()){
                    message = "You need to input a username"
                }else{
                    if(userPasswordEntered.isEmpty()){
                        message = "You need to input a password"
                    }else{
                        val i = Intent(this, HomeActivity2:: class.java)
                        startActivity(i)
                    }
                }

            }
            Snackbar
                .make(
                    findViewById(R.id.loginAct),
                    message,
                    Snackbar.LENGTH_LONG)
                .show()
        }






    }
}