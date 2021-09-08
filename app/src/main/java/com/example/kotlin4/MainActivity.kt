package com.example.kotlin4

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupListener()
        getText2()
    }

    private fun getText2() {
        val title2 = intent.getStringExtra(INTENT_TEXT)
        binding.text2.text = title2

    }

    private fun setupListener() {
        binding.button.setOnClickListener {
            if (binding.editText.text.toString().trim().isEmpty()) {
                Toast.makeText(this, "this text is empty", Toast.LENGTH_SHORT).show()
            } else {
                startActivity(
                    Intent(this, SecondActivity::class.java)
                        .putExtra(INTENT_TEXT, binding.editText.text.toString())
                )
            }
        }

    }

    companion object {
        const val INTENT_TEXT = "asdklfnadskl"
    }
}