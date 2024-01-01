package com.own_world.bundledatapassing

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.own_world.bundledatapassing.databinding.ActivityShowBundleBinding

class ShowBundleActivity : AppCompatActivity() {
    private lateinit var binding: ActivityShowBundleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityShowBundleBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val names = binding.nameshow
        val rolls = binding.rollshow
        val departments = binding.departmentshow
        val semesters = binding.semestershow

        val name = intent.getStringExtra("name")
        val roll = intent.getStringExtra("roll")
        val department = intent.getStringExtra("department")
        val semester = intent.getStringExtra("semester")

        names.text = "NAME : $name"
        rolls.text = "ROLL : $roll"
        departments.text = "DEPARTMENT : $department"
        semesters.text = "SEMESTER : $semester"


    }
}