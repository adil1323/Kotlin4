package com.example.kotlin4

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin4.MainActivity.Companion.INTENT_TEXT
import com.example.kotlin4.databinding.ActivitySecondEmptyBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondEmptyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondEmptyBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getTitleFromMain()
        setText()
    }

    private fun setText() {
        binding.buttonBack.setOnClickListener {
            startActivity(
                Intent(this, MainActivity::class.java)
                    .putExtra(INTENT_TEXT, binding.textView.text.toString())
            )
        }
    }

    private fun getTitleFromMain() {
        val title = intent.getStringExtra(INTENT_TEXT)
        binding.textView.text = title

    }


}