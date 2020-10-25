package com.mj.gof_template_method_pattern

class ConcreteClass : AbstractClass() {

    override fun act1() {
        println("act1 실행")
    }

    override fun act2() {
        println("act2 실행")
    }
}