package com.example.fortuneteller

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.fortuneteller.databinding.MainLayoutBinding

class MainLayout : AppCompatActivity(){
    lateinit var mainLayoutBinding : MainLayoutBinding

    var launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
        result : ActivityResult ->
        if(result.resultCode == Identities.RESULT_LEO){

        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        mainLayoutBinding = MainLayoutBinding.inflate(layoutInflater)
        setContentView(mainLayoutBinding.root)
        super.onCreate(savedInstanceState)

        mainLayoutBinding.aquarius.setOnClickListener{
            var intent = Intent(this , ZodiacMain::class.java)
            intent.putExtra("key" , "aquarius")
            launcher.launch(intent)
        }

        mainLayoutBinding.aries.setOnClickListener{
            var intent = Intent(this , ZodiacMain::class.java)
            intent.putExtra("key" , "aries")
            launcher.launch(intent)
        }
        mainLayoutBinding.cancer.setOnClickListener{
            var intent = Intent(this , ZodiacMain::class.java)
            intent.putExtra("key" , "cancer")
            launcher.launch(intent)
        }
        mainLayoutBinding.capricorn.setOnClickListener{
            var intent = Intent(this , ZodiacMain::class.java)
            intent.putExtra("key" , "capricorn")
            launcher.launch(intent)
        }
        mainLayoutBinding.gemini.setOnClickListener{
            var intent = Intent(this , ZodiacMain::class.java)
            intent.putExtra("key" , "gemini")
            launcher.launch(intent)
        }
        mainLayoutBinding.leo.setOnClickListener{
            var intent = Intent(this , ZodiacMain::class.java)
            intent.putExtra("key" , "leo")
            launcher.launch(intent)
        }
        mainLayoutBinding.libra.setOnClickListener{
            var intent = Intent(this , ZodiacMain::class.java)
            intent.putExtra("key" , "libra")
            launcher.launch(intent)
        }
        mainLayoutBinding.pisces.setOnClickListener{
            var intent = Intent(this , ZodiacMain::class.java)
            intent.putExtra("key" , "pisces")
            launcher.launch(intent)
        }
        mainLayoutBinding.sagittarius.setOnClickListener{
            var intent = Intent(this , ZodiacMain::class.java)
            intent.putExtra("key" , "sagit")
            launcher.launch(intent)
        }
        mainLayoutBinding.scorpio.setOnClickListener{
            var intent = Intent(this , ZodiacMain::class.java)
            intent.putExtra("key" , "scorpio")
            launcher.launch(intent)
        }
        mainLayoutBinding.taurus.setOnClickListener{
            var intent = Intent(this , ZodiacMain::class.java)
            intent.putExtra("key" , "taurus")
            launcher.launch(intent)
        }
        mainLayoutBinding.virgo.setOnClickListener{
            var intent = Intent(this , ZodiacMain::class.java)
            intent.putExtra("key" , "virgo")
            launcher.launch(intent)
        }

    }


}