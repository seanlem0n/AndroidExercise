package com.example.androidexercise

import android.os.Bundle
import android.util.Log
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_random_numbers.*


class MotionGesture : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motion_gesture)

        findViewById<ImageView>(R.id.imageView).setOnTouchListener(object : customGestureListener(){
            override fun onSwipeBottom() {
                Toast.makeText(this@MotionGesture, "Swipe Bottom", Toast.LENGTH_SHORT).show()
            }
              override fun onSwipeLeft() {
                Toast.makeText(this@MotionGesture, "Swipe Left", Toast.LENGTH_SHORT).show()
            }
              override fun onSwipeRight() {
                Toast.makeText(this@MotionGesture, "Swipe Right", Toast.LENGTH_SHORT).show()
            }
              override fun onSwipeTop() {
                Toast.makeText(this@MotionGesture, "Swipe Top", Toast.LENGTH_SHORT).show()
            }
        })

    }

}
