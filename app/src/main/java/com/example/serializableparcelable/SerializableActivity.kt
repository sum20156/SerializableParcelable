package com.example.serializableparcelable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SerializableActivity : AppCompatActivity() {

    private val TAG = "SerializableActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_serializable)
        val intentData:SerializableData? = intent.getSerializableExtra("data") as SerializableData

        val timeTaken = (System.currentTimeMillis()-ELAPSED_TIME)
        Log.i(TAG, "time taken: ${timeTaken}")
    }
}