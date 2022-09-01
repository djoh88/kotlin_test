package com.example.kotlin_test.ex_overriding

open class AAA {
    open fun func() = println("AAA")
}

class BBB : AAA() {

    override fun func() {
//        super.func()
        println("BBBB")
    }
}

fun main() {
    AAA().func()
    BBB().func()

}