package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val TAG = "mytag"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        Log.d(TAG, "onCreate: ")
        val button: Button = findViewById(R.id.button)
        val control: Button = findViewById(R.id.control)
        val name: EditText = findViewById(R.id.name)
        val result: TextView = findViewById(R.id.result)

        var counter: Int = 0;
        button.isEnabled = false
        button.setText("DISABLED")
        var out: String

        control.setOnClickListener {
            if (button.isEnabled()==false) {
                button.isEnabled = true
                button.setText("SUBMIT")
                counter = 1
                result.visibility = View.VISIBLE
                result.setText("")
                Toast.makeText(this, "Button Enabled", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "Button Disabled", Toast.LENGTH_SHORT).show()
                button.isEnabled = false
                button.setText("DISABLED")
                result.visibility = View.INVISIBLE
            }
        }
        button.setOnClickListener {
            out = "Your Name is : ${name.editableText.toString()}\nNumber of clicks : $counter";
            counter++;
            result.setText(out)
            Toast.makeText(this, "Executed Successfully", Toast.LENGTH_SHORT).show()
        }
    }




//    override fun onStart() {
//        super.onStart()
//        Log.d(TAG, "onStart: ")
//    }
//
//    override fun onPostResume() {
//        super.onPostResume()
//        Log.d(TAG, "onPostResume: ")
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Log.d(TAG, "onDestroy: ")
//    }
//
//    override fun onPause() {
//        super.onPause()
//        Log.d(TAG, "onPause: ")
//    }
//
//    override fun onStop() {
//        super.onStop()
//        Log.d(TAG, "onStop: ")
//    }
}