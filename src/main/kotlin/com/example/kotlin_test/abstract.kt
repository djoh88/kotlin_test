package com.example.kotlin_test

open abstract class AbstractClass{
    fun generalMethod() {
        println("일반 메서드")
    }


    open abstract fun abstractMethod()
}

class SubClass : AbstractClass() {

    fun PrintTest() {
        println("Hello World")
    }

    override fun abstractMethod() {
        TODO("Not yet implemented")
    }
}

fun main() {
    var subclass = SubClass()
    subclass.PrintTest()
}