package com.example.fortuneteller

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.fortuneteller.databinding.RegisterBinding

class Register : AppCompatActivity(){
    lateinit var registerBinding : RegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        registerBinding = RegisterBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(registerBinding.root)
    }

    fun signUpButton(view : View){

        if(registerBinding.nameEditText.text.toString().isBlank() ||
            registerBinding.emailEditText.text.toString().isBlank() ||
             registerBinding.passwordEditText.text.toString().isBlank() ||
               registerBinding.titleEditText.text.toString().isBlank()){

            registerBinding.fillAll.visibility = View.VISIBLE
        }
        else{
            Information.name = registerBinding.nameEditText.text.toString()
            Information.email = registerBinding.emailEditText.text.toString()
            Information.password = registerBinding.passwordEditText.text.toString()
            Information.title = registerBinding.titleEditText.text.toString()

            var intent = Intent(this , MainActivity::class.java)
            setResult(RESULT_OK , intent)
            finish()

        }
    }

}