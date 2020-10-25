package com.mj.gof_template_method_pattern

abstract class AbstractClass {

    abstract fun act1()

    abstract fun act2()

    fun tenplateMethod(){
        act1()
        act2()
    }
}