package com.example.aboutme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnDiceActivity.setOnClickListener(this)
        binding.btnChangeNameActivity.setOnClickListener(this)
        binding.btnFragmentActivity.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.btnDiceActivity -> {
                /*Move to Dice activity here*/
                val intent = Intent(this, DiceRollActivity::class.java)
                startActivity(intent)
            }
            R.id.btnChangeNameActivity -> {
                /*Move to Change Name activity here*/
                val intent = Intent(this, ChangeNameActivity::class.java)
                startActivity(intent)
            }
            R.id.btnFragmentActivity -> {
                /*Move to Fragment activity here*/
                val intent = Intent(this, FragmentActivity::class.java)
                startActivity(intent)
            }
        }
    }
}