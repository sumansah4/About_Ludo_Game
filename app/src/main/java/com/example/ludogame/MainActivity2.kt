package com.example.ludogame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import java.util.Random

class MainActivity2 : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //roll button function
        val rollButton = findViewById<Button>(R.id.roll_button)
        rollButton.setOnClickListener {
              Toast.makeText(this, "Button Clicked",Toast.LENGTH_SHORT).show()

              //function for rolling image
              rollDiceFunction()

        }
    }

    private fun rollDiceFunction()
    {
        val randomInt = Random().nextInt(6) + 1

        val drawableResource = when(randomInt)   //when is like switch statement in other programming language
        {
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else-> R.drawable.dice_6
        }

        val diceImage : ImageView = findViewById(R.id.dice_image)
        diceImage.setImageResource(drawableResource)



    }
}