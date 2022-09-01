package com.example.kotlin_test.ex_polymorphism

open class AAA {
    open fun hello() = println("AAA입니다.")
}

class BBB : AAA() {
    override fun hello() = println("BBB입니다.")
}

fun main() {
    val one = AAA()
    val two = BBB()
    val three = two

    one.hello()
    two.hello()
    three.hello()
}