package com.example.submission_akhir_app_android_sederhana.activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.submission_akhir_app_android_sederhana.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.icBack.setOnClickListener{
            finish()
        }


    }
}