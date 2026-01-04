package com.alorferi.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat.enableEdgeToEdge
import androidx.core.view.WindowInsetsCompat
import com.alorferi.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)




        binding.additionButton.setOnClickListener {

            val firstText = binding.firstNumberEditText.text.toString().trim()
            val secondText = binding.secondNumberEditText.text.toString().trim()

            if (firstText.isEmpty() || secondText.isEmpty()) {
                binding.resultTextView.text = "Please enter both numbers"
                return@setOnClickListener
            }

            val firstNumber = firstText.toDouble()
            val secondNumber = secondText.toDouble()

            val result = firstNumber + secondNumber

            // Remove .0 if integer
            binding.resultTextView.text = result.toString()

        }



    }
}