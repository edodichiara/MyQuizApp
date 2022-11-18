package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myquizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnStart.setOnClickListener {
            if (binding.etName.text?.isEmpty() == true){
                Toast.makeText(this, R.string.toast_enteryourname, Toast.LENGTH_SHORT).show()
            } else {
                //move from this activity to QuizQuestionsActivity
                val intent = Intent(this, QuizQuestionsActivity::class.java)

                //To start the intent use the method startActivity()
                startActivity(intent)

                //Close the MainActivity
                finish()
            }
        }
    }
}