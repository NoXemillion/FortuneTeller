package com.example.fortuneteller

import android.content.Intent
import android.os.Bundle
import android.os.Looper
import android.os.Handler
import android.os.PersistableBundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.fortuneteller.databinding.ZodiacMainBinding


class ZodiacMain : AppCompatActivity(){
    lateinit var zodiacMainBinding : ZodiacMainBinding
    lateinit var textView : TextView
    lateinit var text : String


    override fun onCreate(savedInstanceState: Bundle?) {
        zodiacMainBinding = ZodiacMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(zodiacMainBinding.root)

        if(intent.getStringExtra("key").equals("leo")){
            var title : TextView = findViewById(R.id.title)
            textView = zodiacMainBinding.zodiacDisc
            text = getString(R.string.leo_disc)
            var zodiacSign = findViewById<ImageView>(R.id.zodiac_sign)
            zodiacSign.setImageResource(R.drawable.leo_sign)
            title.text = "Leo: The Radiant Sovereign"
        }
        else if(intent.getStringExtra("key").equals("aquarius")){
            var title : TextView = findViewById(R.id.title)
            textView = zodiacMainBinding.zodiacDisc
            text = getString(R.string.aquarius_disc)
            var zodiacSign = findViewById<ImageView>(R.id.zodiac_sign)
            zodiacSign.setImageResource(R.drawable.aquarius_sign)
            title = findViewById(R.id.title)
            title.text = "Aquarius: The Visionary Innovator"
        }
        else if(intent.getStringExtra("key").equals("aries")){
            var title : TextView = findViewById(R.id.title)
            textView = zodiacMainBinding.zodiacDisc
            text = getString(R.string.aries_disc)
            var zodiacSign = findViewById<ImageView>(R.id.zodiac_sign)
            zodiacSign.setImageResource(R.drawable.aries_sign)
            title.text = "Aries: The Fiery Pioneer"
        }
        else if(intent.getStringExtra("key").equals("cancer")){
            var title : TextView = findViewById(R.id.title)
            textView = zodiacMainBinding.zodiacDisc
            text = getString(R.string.cancer_disc)
            var zodiacSign = findViewById<ImageView>(R.id.zodiac_sign)
            zodiacSign.setImageResource(R.drawable.cancer_sign)
            title.text = "Cancer: The Moonlit Nurturer"
        }
        else if(intent.getStringExtra("key").equals("capricorn")){
            var title : TextView = findViewById(R.id.title)
            textView = zodiacMainBinding.zodiacDisc
            text = getString(R.string.capricorn_disc)
            var zodiacSign = findViewById<ImageView>(R.id.zodiac_sign)
            zodiacSign.setImageResource(R.drawable.capricorn_sign)
            title.text = "Capricorn: The Mountainous Sage"
        }
        else if(intent.getStringExtra("key").equals("gemini")){
            var title : TextView = findViewById(R.id.title)
            textView = zodiacMainBinding.zodiacDisc
            text = getString(R.string.gemini_disc)
            var zodiacSign = findViewById<ImageView>(R.id.zodiac_sign)
            zodiacSign.setImageResource(R.drawable.gemini_sign)
            title.text = "Gemini: The Celestial Communicator"
        }
        else if(intent.getStringExtra("key").equals("libra")){
            var title : TextView = findViewById(R.id.title)
            textView = zodiacMainBinding.zodiacDisc
            text = getString(R.string.libra_disc)
            var zodiacSign = findViewById<ImageView>(R.id.zodiac_sign)
            zodiacSign.setImageResource(R.drawable.libra_sign)
            title.text = "Libra: The Harmonious Diplomat"
        }
        else if(intent.getStringExtra("key").equals("pisces")){
            var title : TextView = findViewById(R.id.title)
            textView = zodiacMainBinding.zodiacDisc
            text = getString(R.string.pisces_disc)
            var zodiacSign = findViewById<ImageView>(R.id.zodiac_sign)
            zodiacSign.setImageResource(R.drawable.pisces_sign)
            title.text = "Pisces: The Dreamweaver"
        }
        else if(intent.getStringExtra("key").equals("sagit")){
            var title : TextView = findViewById(R.id.title)
            textView = zodiacMainBinding.zodiacDisc
            text = getString(R.string.sagit_disc)
            var zodiacSign = findViewById<ImageView>(R.id.zodiac_sign)
            zodiacSign.setImageResource(R.drawable.sagi_sign)
            title.text = "Sagittarius: The Celestial Adventurer"
        }
        else if(intent.getStringExtra("key").equals("scorpio")){
            var title : TextView = findViewById(R.id.title)
            textView = zodiacMainBinding.zodiacDisc
            text = getString(R.string.scorpio_disc)
            var zodiacSign = findViewById<ImageView>(R.id.zodiac_sign)
            zodiacSign.setImageResource(R.drawable.scorpio_sign)
            title.text = "Scorpio: The Intense Enigma"
        }
        else if(intent.getStringExtra("key").equals("taurus")){
            var title : TextView = findViewById(R.id.title)
            textView = zodiacMainBinding.zodiacDisc
            text = getString(R.string.taurus_disc)
            var zodiacSign = findViewById<ImageView>(R.id.zodiac_sign)
            zodiacSign.setImageResource(R.drawable.taurus_sign)
            title.text = "Taurus: The Earthly Guardian"
        }
        else if(intent.getStringExtra("key").equals("virgo")){
            var title : TextView = findViewById(R.id.title)
            textView = zodiacMainBinding.zodiacDisc
            text = getString(R.string.taurus_disc)
            var zodiacSign = findViewById<ImageView>(R.id.zodiac_sign)
            zodiacSign.setImageResource(R.drawable.virgo_sign)
            title.text = "Virgo: The Celestial Analyst"
        }

        animateText(textView , text , 30)
    }
    fun animateText(textView : TextView, text : String, delay : Long = 100){
        val handler = Handler(Looper.getMainLooper())
        textView.text = ""
        var index = 0

        val runnable = object : Runnable {
            override fun run() {
                if(index < text.length){
                    textView.text = textView.text.toString() + text[index]
                    index++
                    handler.postDelayed(this ,delay)
                }
            }
        }
        handler.post(runnable)

    }
    fun onMain(view : View){
        var intent = Intent()
        setResult(RESULT_OK , intent)
        finish()
    }
}