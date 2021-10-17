package com.realtomjoney.pixels_and_dps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import androidx.constraintlayout.widget.ConstraintLayout
import com.realtomjoney.pixels_and_dps.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setBindings()

        val params = binding.textView.layoutParams as ConstraintLayout.LayoutParams

        val metrics: DisplayMetrics = resources.displayMetrics

        val w = 200 / 160F * metrics.densityDpi

        params.width = w.toInt()
        params.height = w.toInt()


    }

    private fun setBindings() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}