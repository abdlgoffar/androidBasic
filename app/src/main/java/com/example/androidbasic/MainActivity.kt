package com.example.androidbasic

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    private lateinit var helloEditText: EditText
    private lateinit var helloText: TextView
    private lateinit var helloButton: Button
    private lateinit var textOne: TextView


    private fun initComponents() {
        helloEditText = findViewById(R.id.helloEditText)
        helloButton = findViewById(R.id.helloButton)
        helloText = findViewById(R.id.helloText)
        textOne = findViewById(R.id.textOne)
    }

//    code 001 cara penggunaan method onCreate
    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
//    code 002, cara pemanggilan layout pada class Activity
    setContentView(R.layout.layout_linear)
//    code 002
    initComponents()
//    code 003, cara penggunaan action listener
    helloButton.setOnClickListener {
        val inputText = helloEditText.text.toString()
        helloText.text = "Hi $inputText"
    }
//    code 003
    //    code 004, cara pemanggilan string/text resource
    textOne.text = resources.getText(R.string.text_one)
//    code 004
    }
//    001




//    code 005, cara penggunaan class packageManager
    fun checkFeature() {

        if (packageManager.hasSystemFeature(PackageManager.FEATURE_FINGERPRINT) == true) {
            Log.i("FEATURE", "feature fingerprint in phone is available")
        } else {
            Log.i("FEATURE", "feature fingerprint in phone is not available")
        }

        if (packageManager.hasSystemFeature(PackageManager.FEATURE_CAMERA) == true) {
            Log.i("FEATURE", "feature camera in phone is available")
        } else {
            Log.i("FEATURE", "feature camera in phone is not available")
        }
    }
//    code 005
}