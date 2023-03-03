package com.example.aboutme

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.aboutme.databinding.ActivityDiceRollBinding

class DiceRollActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityDiceRollBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDiceRollBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnRoll.setOnClickListener(this)
        binding.btnBack.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.btnRoll -> {
                val randomInt = (1..6).random()
                /*Set source Image*/
                val roll = when (randomInt){
                    1-> R.drawable.dice_1
                    2-> R.drawable.dice_2
                    3-> R.drawable.dice_3
                    4-> R.drawable.dice_4
                    5-> R.drawable.dice_5
                    else -> R.drawable.dice_6
                }
                binding.imgDice.setImageResource(roll)
                binding.numberRoll.text = randomInt.toString()
            }
            R.id.btnBack -> {
                /*turn back*/
                super.onBackPressed()
            }
        }
    }
}