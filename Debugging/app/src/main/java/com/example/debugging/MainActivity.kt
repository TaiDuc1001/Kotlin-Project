package com.example.debugging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "MainActivity"

fun division() {
    val numerator = 60
    var denominator = 4
    repeat(5) {
        Log.v(TAG, "${numerator / denominator}")
        denominator--
    }
}

fun logging(){
    Log.v(TAG, "Hello, world!")
    Log.e(TAG, "ERROR: a serious error like an app crash")
    Log.i(TAG, "INFO: reporting technical information, such as an operation succeeding")
    Log.d(TAG, "DEBUG: reporting technical information useful for debugging")
    Log.w(TAG, "WARN: warns about the potential for serious errors")
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logging()
        division()
    }
}