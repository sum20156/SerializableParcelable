package com.example.serializableparcelable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ParcelableActivity : AppCompatActivity() {
    private val TAG = "ParcelableActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_testing)
        val intentData:ParcelableData? = intent.getParcelableExtra("data")

        val timeTaken = (System.currentTimeMillis()-ELAPSED_TIME)
        Log.i(TAG, "time taken: ${timeTaken}")
    }
}