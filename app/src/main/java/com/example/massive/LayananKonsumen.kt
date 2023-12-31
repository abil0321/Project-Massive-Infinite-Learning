package com.example.massive

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.massive.databinding.ActivityLayananKonsumenBinding

class LayananKonsumen : AppCompatActivity() {
    private lateinit var binding: ActivityLayananKonsumenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLayananKonsumenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnKirim.setOnClickListener {
            onBackPressed()
        }
        binding.back4.setOnClickListener {
            onBackPressed()
        }
    }
    private fun navigateToProfileFragment() {
        startActivity(Intent(this, Profile::class.java))
    }
}