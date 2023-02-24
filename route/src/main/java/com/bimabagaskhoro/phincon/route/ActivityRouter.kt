package com.bimabagaskhoro.phincon.route

import android.content.Context
import android.content.Intent

interface ActivityRouter {
    fun task1(context: Context): Intent
    fun task2(context: Context): Intent
    fun task3(context: Context): Intent
}