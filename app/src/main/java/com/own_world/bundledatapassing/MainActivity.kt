package com.own_world.bundledatapassing

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.own_world.bundledatapassing.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.nextbtn.setOnClickListener {
            val name = binding.name.text.toString()
            val roll = binding.roll.text.toString()
            val department = binding.department.text.toString()
            val semester = binding.semester.text.toString()
             val intent = Intent(this, ShowBundleActivity::class.java)

            intent.putExtra("name",name)
            intent.putExtra("roll",roll)
            intent.putExtra("department",department)
            intent.putExtra("semester",semester)
            startActivity(intent)
        }
    }
}