package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.aboutme.databinding.ActivityFragmentBinding

class FragmentActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFragmentBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnBack.setOnClickListener(this)
        binding.btnShowFragment.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.btnBack -> {
                super.onBackPressed()
            }
            R.id.btnShowFragment -> {

            }
        }
    }
}