package com.example.serializableparcelable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

var ELAPSED_TIME=-1L

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = ArrayList<Int>()
        //making size of the data big, so that we can see major time difference btw serializable & parcelable
        for (i in 0..10000){
            data.add(i)
        }

        val parcelableData = ParcelableData("","","","","",data)
        val serializableData = SerializableData("","","","","",data)

        // start any one of the activity to check speed
        startSerializableActivity(serializableData)
        // startParcelableActivity(parcelableData)
    }

    fun startParcelableActivity(intentData:ParcelableData){
        ELAPSED_TIME = System.currentTimeMillis()
        startActivity(
            Intent(this,ParcelableActivity::class.java)
                .putExtra("data",intentData))
    }

    fun startSerializableActivity(intentData:SerializableData){
        ELAPSED_TIME = System.currentTimeMillis()
        startActivity(
            Intent(this,SerializableActivity::class.java)
                .putExtra("data",intentData))
    }
}