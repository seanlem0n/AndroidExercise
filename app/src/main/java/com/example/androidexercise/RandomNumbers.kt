package com.example.androidexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class RandomNumbers : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random_numbers)

        val mButton = findViewById<Button>(R.id.btn_randomize)
        var randomSet = generateRandomNumbers(10)
        mButton.setOnClickListener{
            Toast.makeText(this@RandomNumbers, randomSet.toString(),
                Toast.LENGTH_SHORT).show()

            randomSet = generateRandomNumbers(10)
            findViewById<TextView>(R.id.textView).text = randomSet.elementAt(0).toString()
            findViewById<TextView>(R.id.textView2).text = randomSet.elementAt(1).toString()
            findViewById<TextView>(R.id.textView3).text = randomSet.elementAt(2).toString()
            findViewById<TextView>(R.id.textView4).text = randomSet.elementAt(3).toString()
            findViewById<TextView>(R.id.textView5).text = randomSet.elementAt(4).toString()
            findViewById<TextView>(R.id.textView6).text = randomSet.elementAt(5).toString()
            findViewById<TextView>(R.id.textView7).text = randomSet.elementAt(6).toString()
            findViewById<TextView>(R.id.textView8).text = randomSet.elementAt(7).toString()
            findViewById<TextView>(R.id.textView9).text = randomSet.elementAt(8).toString()
        }
    }

    fun generateRandomNumbers(total: Int):Set<Int>{
        val randomNumbers = mutableSetOf<Int>()
        while(randomNumbers.size < total){
            randomNumbers.add(Random.nextInt(10))
        }
        return randomNumbers
    }
}
