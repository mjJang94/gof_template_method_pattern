package com.mj.gof_template_method_pattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val abstractClass =  ConcreteClass()

        abstractClass.act1()
        abstractClass.act2()
        abstractClass.tenplateMethod()

    }
}