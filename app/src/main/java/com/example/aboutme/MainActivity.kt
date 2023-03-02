package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.buttonChangeName.setOnClickListener(this)
        binding.btnClearAll.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.buttonChangeName -> {
                val rowTextView = TextView(this)
                rowTextView.text = "1111 \n"
                binding.textLayout.addView(rowTextView)
            }
            R.id.btnClearAll -> {
                binding.layoutMain.visibility = View.GONE
            }
        }
    }
}