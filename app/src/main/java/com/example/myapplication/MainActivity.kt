package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    var state = R.drawable.check_circle_outline_black_24dp
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image = findViewById<ImageView>(R.id.imageView)
        image.setOnClickListener{
            state = when (state){
                R.drawable.check_circle_outline_black_24dp -> R.drawable.done_black_24dp
                R.drawable.done_black_24dp -> R.drawable.trending_up_black_24dp
                else->R.drawable.check_circle_outline_black_24dp
            }
            image.setImageDrawable(getDrawable(state))
        }
    }
}