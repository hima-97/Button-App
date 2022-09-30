package com.buttonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun button1_onclick(view: View)
    {
        val newText = findViewById<TextView>(R.id.myTextView)
        newText.text = "Button 1"
    }

    fun button2_onclick(view: View)
    {
        val newText = findViewById<TextView>(R.id.myTextView)
        newText.text = "Button 2"
    }

    fun button3_onclick(view: View)
    {
        val newText = findViewById<TextView>(R.id.myTextView)
        newText.text = "Button 3"
    }

    fun button4_onclick(view: View)
    {
        val myButton4 = findViewById<TextView>(R.id.myTextView)
        myButton4.text = "Button 4"
    }

    fun button5_onclick(view: View)
    {
        val newText = findViewById<TextView>(R.id.myTextView)
        newText.text = "Button 5"
    }

    fun button6_onclick(view: View)
    {
        val newText = findViewById<TextView>(R.id.myTextView)
        newText.text = "Button 6"
    }

    fun button7_onclick(view: View)
    {
        val newText = findViewById<TextView>(R.id.myTextView)
        newText.text = "Button 7"
    }

    fun button8_onclick(view: View)
    {
        val newText = findViewById<TextView>(R.id.myTextView)
        newText.text = "Button 8"
    }

    fun button9_onclick(view: View)
    {
        val newText = findViewById<TextView>(R.id.myTextView)
        newText.text = "Button 9"
    }
}