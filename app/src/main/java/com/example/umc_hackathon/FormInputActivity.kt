package com.example.umc_hackathon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.umc_hackathon.databinding.ActivityFormInputBinding

class FormInputActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityFormInputBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.formInputCancelBtn.setOnClickListener {
            val intent = Intent(this, FormDetailActivity::class.java)
            intent.addFlags (Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
            finish()
        }

        binding.formInputSubmitBtn.setOnClickListener {
            val intent = Intent(this, FormDetailActivity::class.java)
            intent.addFlags (Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
            finish()
        }
    }
}