package com.example.aboutme

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.aboutme.databinding.ActivityChangeNameBinding

class ChangeNameActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityChangeNameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChangeNameBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnChangeName.setOnClickListener(this)
        binding.btnBack.setOnClickListener(this)
    }
    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.btnChangeName -> {
                binding.initName.text = binding.editName.text
            }
            R.id.btnBack -> {
                /*turn back*/
                super.onBackPressed()
            }
        }
    }
}
