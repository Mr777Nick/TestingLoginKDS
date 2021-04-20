package com.example.testingloginkds

import android.graphics.Matrix
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun setBackgroundTopSize() {
        val imageView: ImageView = findViewById(R.id.imageView);
        val matrix: Matrix = imageView.imageMatrix;
        val imageWidth: Float = imageView.drawable.intrinsicWidth.toFloat();
        val screenWidth: Int = resources.displayMetrics.widthPixels;
        val scaleRatio: Float = screenWidth / imageWidth;
        matrix.postScale(scaleRatio, scaleRatio);
        imageView.imageMatrix = matrix;
    }
}