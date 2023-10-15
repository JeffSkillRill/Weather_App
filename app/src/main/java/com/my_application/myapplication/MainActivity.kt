package com.my_application.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.my_application.myapplication.databinding.ActivityMainBinding
import com.my_application.myapplication.ui.Weather2Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)

        supportFragmentManager.beginTransaction().add(R.id.main, Weather2Fragment()).commit()

        setContentView(binding.root)
    }
}