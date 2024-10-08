package com.example.fortuneteller


import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.fortuneteller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mainBinding : ActivityMainBinding
    private var launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
        result : ActivityResult ->
        if(result.resultCode == RESULT_OK){

        }
        else if(result.resultCode == RESULT_FIRST_USER){

        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(mainBinding.root)
    }

    fun loginButton(view : View){
        var email = mainBinding.emailEditText.text.toString()
        var password = mainBinding.passwordEditText.text.toString()
        var title = mainBinding.titleEditText.text.toString()

        if(Information.email == null &&
            Information.password == null &&
            Information.title == null){
            mainBinding.fillInfo.visibility = View.VISIBLE
        }else{
            if(Information.email.equals(email) &&
                Information.password.equals(password) &&
                Information.title.equals(title)){
                var intent = Intent(this , MainLayout::class.java)
                launcher.launch(intent)

            }else{
                mainBinding.fillInfo.visibility = View.VISIBLE
                mainBinding.fillInfo.text = "EITHER EMAIL , PASSWORD OR TITLE IS WRONG"
            }
        }
    }
    fun registerLink(view : View){
        var intent = Intent(this , Register::class.java)
        launcher.launch(intent)
    }

}