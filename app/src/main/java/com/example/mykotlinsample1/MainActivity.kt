package com.example.mykotlinsample1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        println("This is my first Kotlin Program")
        println("My hobbies are listening music, cooking, interacting with good people, travelling and others")

        val myPlaceholder = "Neeti"
        println(myPlaceholder)

        val number = 20
        println(number)

        val checkVal1: String? = null
        val checkVal2: Int? = null
        val myName = "Gupta"
        val pinCode = 124352

        println(myName)
        println(checkVal1)
        println(checkVal2)
        println("pinCode: $pinCode")
        print("Enter age:")

        val age = readLine()
        print("Print Age: $age")

        val myIntValue = "678"
        val myIntValueAsString: Int = myIntValue.toInt()
        println(myIntValueAsString)

        val myIntValue1 = 27.67f
        val myDoubleValue: Double = myIntValue1.toDouble()
        println(myDoubleValue)
    }
}