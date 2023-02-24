package com.bimabagaskhoro.phincon.task3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bimabagaskhoro.phincon.route.ActivityRouter
import com.bimabagaskhoro.phincon.task3.databinding.ActivityTask3Binding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class Task3Activity : AppCompatActivity() {
    @Inject
    lateinit var router: ActivityRouter
    private lateinit var binding: ActivityTask3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTask3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            navigateToTask3()
        }
    }

    private fun navigateToTask3() {
        startActivity(router.task1(this).apply {
            flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        })
        finish()
    }
}