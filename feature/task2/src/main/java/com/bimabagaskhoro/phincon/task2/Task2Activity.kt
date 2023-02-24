package com.bimabagaskhoro.phincon.task2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bimabagaskhoro.phincon.route.ActivityRouter
import com.bimabagaskhoro.phincon.task2.databinding.ActivityTask2Binding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class Task2Activity : AppCompatActivity() {
    @Inject
    lateinit var router: ActivityRouter
    private lateinit var binding: ActivityTask2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTask2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            navigateToTask2()
        }
    }

    private fun navigateToTask2() {
        startActivity(router.task3(this).apply {
            flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        })
        finish()
    }
}