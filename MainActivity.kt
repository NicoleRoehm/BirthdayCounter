package com.example.countdown

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.zip.ZipEntry

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val titleText = findViewById<TextView>(R.id.tiltetext)
        val counterText = findViewById<TextView>(R.id.countertext)
        val button = findViewById<Button>(R.id.push_button)

        var counter = 1

        counterText.text = counter.toString()

        button.setOnClickListener {
            counter++
            counterText.text = counter.toString()

            if (counter == 26){
                counter = 0
                titleText.text = "Happy Birthday"
                counterText.text = ""
            }else {
                titleText.text = "BirthdayCounter"
            }

        }
    }
}