package com.bimabagaskhoro.phincon.task1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bimabagaskhoro.phincon.route.ActivityRouter
import com.bimabagaskhoro.phincon.task1.databinding.ActivityTask1Binding
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.migration.CustomInjection.inject
import javax.inject.Inject

@AndroidEntryPoint
class Task1Activity : AppCompatActivity() {

    @Inject
    lateinit var router: ActivityRouter
    private lateinit var binding: ActivityTask1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTask1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            navigateToTask1()
        }
    }

    private fun navigateToTask1() {
        startActivity(router.task2(this).apply {
            flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        })
        finish()
    }
}