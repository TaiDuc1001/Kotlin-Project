package com.example.calculatormorebasic

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculatormorebasic.databinding.ActivityMainBinding
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.plusBtn.setOnClickListener { plusFunc() }
        binding.minusBtn.setOnClickListener { minusFunc() }
        binding.multiplyBtn.setOnClickListener { multiFunc() }
        binding.divisionBtn.setOnClickListener { divideFunc() }
        binding.delBtn.setOnClickListener { delFunc() }

        binding.editTextSecondNumber.setOnKeyListener { view, keyCode, _ -> handleKeyEvent(view, keyCode) }
    }

    private fun plusFunc() {
        val numberInEditText1 = binding.editTextFirstNumber.text.toString()
        val numberInEditText2 = binding.editTextSecondNumber.text.toString()
        if (numberInEditText1.isNotEmpty() && numberInEditText2.isNotEmpty()) {
            var result = (numberInEditText1.toDouble() + numberInEditText2.toDouble()).toString()
            binding.resultOfEquation.setText(result)
        }
        else {
            Snackbar.make(findViewById(R.id.linearLayout), "Enter valid numbers", Snackbar.LENGTH_LONG ).show()
        }
    }

    private fun minusFunc() {
        val numberInEditText1 = binding.editTextFirstNumber.text.toString()
        val numberInEditText2 = binding.editTextSecondNumber.text.toString()
        if (numberInEditText1.isNotEmpty() && numberInEditText2.isNotEmpty()) {
            var result = (numberInEditText1.toDouble() - numberInEditText2.toDouble()).toString()
            binding.resultOfEquation.setText(result)
        }
        else {
            Snackbar.make(findViewById(R.id.linearLayout), "Enter valid numbers", Snackbar.LENGTH_LONG ).show()
        }
    }

    private fun multiFunc() {
        val numberInEditText1 = binding.editTextFirstNumber.text.toString()
        val numberInEditText2 = binding.editTextSecondNumber.text.toString()
        if (numberInEditText1.isNotEmpty() && numberInEditText2.isNotEmpty()) {
            var result = (numberInEditText1.toDouble() * numberInEditText2.toDouble()).toString()
            binding.resultOfEquation.setText(result)
        }
        else {
            Snackbar.make(findViewById(R.id.linearLayout), "Enter valid numbers", Snackbar.LENGTH_LONG ).show()
        }
    }

    private fun divideFunc() {
        val numberInEditText1 = binding.editTextFirstNumber.text.toString()
        val numberInEditText2 = binding.editTextSecondNumber.text.toString()
        if (numberInEditText1.isNotEmpty() && numberInEditText2.isNotEmpty()) {
            var result = (numberInEditText1.toDouble() / numberInEditText2.toDouble()).toString()
            binding.resultOfEquation.setText(result)
        }
        else {
            Snackbar.make(findViewById(R.id.linearLayout), "Enter valid numbers", Snackbar.LENGTH_LONG ).show()
        }
    }

    private fun delFunc() {
        binding.editTextFirstNumber.setText("")
        binding.editTextSecondNumber.setText("")
        binding.resultOfEquation.setText("")
    }


    private fun handleKeyEvent(view: View, keyCode: Int): Boolean {
        if (keyCode == KeyEvent.KEYCODE_ENTER){
            val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
            return true
        }
        return false
    }
//

}