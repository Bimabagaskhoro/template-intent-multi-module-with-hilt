package com.bimabagaskhoro.phincon.myintentmultimodule

import android.content.Context
import android.content.Intent
import com.bimabagaskhoro.phincon.route.ActivityRouter
import com.bimabagaskhoro.phincon.task1.Task1Activity
import com.bimabagaskhoro.phincon.task2.Task2Activity
import com.bimabagaskhoro.phincon.task3.Task3Activity

class ActivityRouterImpl : ActivityRouter {
    override fun task1(context: Context): Intent {
        return Intent(context, Task1Activity::class.java)
    }

    override fun task2(context: Context): Intent {
        return Intent(context, Task2Activity::class.java)
    }

    override fun task3(context: Context): Intent {
        return Intent(context, Task3Activity::class.java)
    }

}