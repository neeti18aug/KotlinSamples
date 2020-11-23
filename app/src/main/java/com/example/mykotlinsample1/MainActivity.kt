package com.example.mykotlinsample1

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

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

        var myPlaceholder = "Neeti"
        println(myPlaceholder)

        var number = 20
        println(number)

        //This is single line comment

        /*
        *
        * This is multiline comment
        * */

        var myName :  String = "Neeti"
        val pincode : Int = 209878          //CONSTANT value
        var floatval : Float = 20.6f
        var checkVal1 : String? = null      //OPTIONAL- to support null, have to put ? with variable tye, null means invalid
        val checkVal2 : Int? = null

        myName = "Gupta"
       // pincode = 124352                  //can't reassigned value as it's val type

        println(myName)
        println(checkVal1)
        println(checkVal2)
        println("Pincode: "+pincode)        //Concatenating values

        /*print("Enter age:")
        var age = readLine()
        print("Print Age: " + age)*/        //not working, need to check

       // var myIntValue : String = "678"
       // var myIntValueAsString : Int
       // myIntValueAsString = myIntValue.toInt()
       // println(myIntValueAsString)

        var myIntValue: Float = 27.67f
        var myDoubleValue: Double = myIntValue.toDouble()
        println(myDoubleValue)




    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}