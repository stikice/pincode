package com.example.pincode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pin: TextView = findViewById(R.id.pin)

        val b1: Button = findViewById(R.id.button1)
        val b2: Button = findViewById(R.id.button2)
        val b3: Button = findViewById(R.id.button3)
        val b4: Button = findViewById(R.id.button4)
        val b5: Button = findViewById(R.id.button5)
        val b6: Button = findViewById(R.id.button6)
        val b7: Button = findViewById(R.id.button7)
        val b8: Button = findViewById(R.id.button8)
        val b9: Button = findViewById(R.id.button9)
        val b0: Button = findViewById(R.id.button0)
        val bc: Button = findViewById(R.id.buttonC)
        val bok: Button = findViewById(R.id.buttonOK)

        b1.setOnClickListener(){
            pin.text = pin.text.toString() + b1.text.toString()
        }
        b2.setOnClickListener(){
            pin.text = pin.text.toString() + b2.text.toString()
        }
        b3.setOnClickListener(){
            pin.text = pin.text.toString() + b3.text.toString()
        }
        b4.setOnClickListener(){
            pin.text = pin.text.toString() + b4.text.toString()
        }
        b5.setOnClickListener(){
            pin.text = pin.text.toString() + b5.text.toString()
        }
        b6.setOnClickListener(){
            pin.text = pin.text.toString() + b6.text.toString()
        }
        b7.setOnClickListener(){
            pin.text = pin.text.toString() + b7.text.toString()
        }
        b8.setOnClickListener(){
            pin.text = pin.text.toString() + b8.text.toString()
        }
        b9.setOnClickListener(){
            pin.text = pin.text.toString() + b9.text.toString()
        }
        b0.setOnClickListener(){
            pin.text = pin.text.toString() + b0.text.toString()
        }
        bok.setOnClickListener(){
            if(pin.text.equals(getString(R.string.pin))){
                Toast.makeText(this, getString(R.string.correct_text), Toast.LENGTH_SHORT).show()
            }
        }
        bc.setOnClickListener(){
            if(pin.text.isNotEmpty()){
                pin.text = pin.text.substring(0, pin.text.length-1)
            }
        }


    }
}