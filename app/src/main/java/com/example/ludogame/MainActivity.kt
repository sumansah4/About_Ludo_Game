package com.example.ludogame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    fun moveNextPage(view: View)
    {
        //from one activity to another activity
        val intent1 = Intent(this,MainActivity2::class.java)
        startActivity(intent1)
    }



}