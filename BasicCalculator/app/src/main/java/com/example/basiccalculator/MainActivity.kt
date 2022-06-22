package com.example.basiccalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.basiccalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.plusBtn.setOnClickListener { calFunc() }
//        binding.minusBtn.setOnClickListener { calFunc() }
//        binding.multiplicationBtn.setOnClickListener { calFunc() }
//        binding.divisionBtn.setOnClickListener { calFunc() }
//        binding.openParenthesesBtn.setOnClickListener { calFunc() }
//        binding.closeParenthesesBtn.setOnClickListener { calFunc() }
//        binding.calculateBtn.setOnClickListener { calFunc() }
        binding.clearBtn?.setOnClickListener { clearFunc() }
        binding.deleteBtn.setOnClickListener { clearFunc() }
        binding.numOneBtn?.setOnClickListener { numOneFunc() }
        binding.numTwoBtn?.setOnClickListener { numTwoFunc() }
        binding.numThreeBtn?.setOnClickListener { numThreeFunc() }
        binding.numFourBtn?.setOnClickListener { numFourFunc() }
        binding.numFiveBtn?.setOnClickListener { numFiveFunc() }
        binding.numSixBtn?.setOnClickListener { numSixFunc() }
        binding.numSevenBtn?.setOnClickListener { numSevenFunc() }
        binding.numEightBtn?.setOnClickListener { numEight() }
        binding.numNineBtn?.setOnClickListener { numNineFunc() }
        binding.numZeroBtn?.setOnClickListener { numZeroFunc() }
    }

    @SuppressLint("SetTextI18n")
    private fun numZeroFunc() {
        val resultField = binding.resultValue.text.toString()
        binding.resultValue.setText(resultField + "0")
    }

    @SuppressLint("SetTextI18n")
    private fun numNineFunc() {
        val resultField = binding.resultValue.text.toString()
        binding.resultValue.setText(resultField + "9")
    }

    @SuppressLint("SetTextI18n")
    private fun numEight() {
        val resultField = binding.resultValue.text.toString()
        binding.resultValue.setText(resultField + "8")
    }

    @SuppressLint("SetTextI18n")
    private fun numSevenFunc() {
        val resultField = binding.resultValue.text.toString()
        binding.resultValue.setText(resultField + "7")
    }

    @SuppressLint("SetTextI18n")
    private fun numSixFunc() {
        val resultField = binding.resultValue.text.toString()
        binding.resultValue.setText(resultField + "6")
    }

    @SuppressLint("SetTextI18n")
    private fun numFiveFunc() {
        val resultField = binding.resultValue.text.toString()
        binding.resultValue.setText(resultField + "5")
    }

    @SuppressLint("SetTextI18n")
    private fun numFourFunc() {
        val resultField = binding.resultValue.text.toString()
        binding.resultValue.setText(resultField + "4")
    }

    @SuppressLint("SetTextI18n")
    private fun numThreeFunc() {
        val resultField = binding.resultValue.text.toString()
        binding.resultValue.setText(resultField + "3")
    }

    @SuppressLint("SetTextI18n")
    private fun numTwoFunc() {
        val resultField = binding.resultValue.text.toString()
        binding.resultValue.setText(resultField + "2")
    }

    @SuppressLint("SetTextI18n")
    private fun numOneFunc() {
        val resultField = binding.resultValue.text.toString()
        binding.resultValue.setText(resultField + "1")
    }

    private fun clearFunc() {
        binding.resultValue.setText("")
    }

    private fun calFunc() {
        TODO("Not yet implemented")
    }
}