package com.example.kheloaurkharido

import android.content.Intent
import android.os.Bundle
import android.view.MotionEvent
import android.view.ScaleGestureDetector
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class itemlist : AppCompatActivity() {
    var imgfull = findViewById(R.id.img1) as ImageView
    private lateinit var scaleGestureDetector: ScaleGestureDetector
    private var scaleFactor = 1.0f
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_itemlist)
        scaleGestureDetector = ScaleGestureDetector(this, ScaleListener())
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        // Pass touch events to ScaleGestureDetector
        scaleGestureDetector.onTouchEvent(event)
        return true
    }

    private inner class ScaleListener : ScaleGestureDetector.SimpleOnScaleGestureListener() {
        override fun onScale(detector: ScaleGestureDetector): Boolean {
            // Get scale factor from ScaleGestureDetector
            scaleFactor *= detector.scaleFactor

            // Prevent scaling to smaller than original size or too large
            scaleFactor = Math.max(1.0f, Math.min(scaleFactor, 10.0f))

            // Set scale factor to ImageView matrix
            imgfull.scaleX = scaleFactor
            imgfull.scaleY = scaleFactor

            return true

        }

    }
}