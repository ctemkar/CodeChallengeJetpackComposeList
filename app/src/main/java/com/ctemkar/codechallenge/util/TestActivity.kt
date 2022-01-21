package com.ctemkar.codechallenge.util

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ctemkar.codechallenge.R

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        val data = intent.getStringExtra("data")
        Toast.makeText(getApplicationContext(),data,Toast.LENGTH_SHORT).show()

    }
}