package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.NumberPicker
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }

    }

    // write function for roll dice
    private fun rollDice() {

        val diceImage: ImageView = findViewById(R.id.imageView)
        val resultNumber = Dice(6).roll()
//        when (resultNumber) {
//            1 -> diceImage.setImageResource(R.drawable.dice_1)
//            2 -> diceImage.setImageResource(R.drawable.dice_2)
//            3 -> diceImage.setImageResource(R.drawable.dice_3)
//            4 -> diceImage.setImageResource(R.drawable.dice_4)
//            5 -> diceImage.setImageResource(R.drawable.dice_5)
//            6 -> diceImage.setImageResource(R.drawable.dice_6)
//        }
        val drawableResource = when (resultNumber) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)

        val luckyNumber: TextView = findViewById(R.id.textView3)
        val resultText: TextView = findViewById(R.id.resultTextView)

        when (luckyNumber.text) {
            resultNumber.toString() -> resultText.text = "Lucky number is ${luckyNumber.text} \nYour dice roll is lucky!"
            else -> resultText.text = "Lucky number is ${luckyNumber.text} \nTry again!"
        }


    }
}

// class for random dice roll
class Dice (val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}