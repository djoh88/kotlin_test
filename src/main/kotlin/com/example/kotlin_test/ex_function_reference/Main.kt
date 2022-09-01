package com.example.kotlin_test.ex_function_reference

fun plus(a: Int, b: Int) = println("plus 호출됨 ${a + b}")

object Object {
    fun average(a: Int, b: Int) = println("Object average 호출됨 ${(a + b) / 2}")
}

class Class {
    fun average(a: Int, b: Int) = println("Class average 호출됨 ${(a + b) / 2}")
}

var sum: (Int, Int) -> Int = { x, y -> x+y}

fun main() {
    var instantFunc: (Int, Int) -> Unit = {x,y -> plus(x, y) }
    var instantFunc2: (Int, Int) -> Unit = ::plus
    instantFunc(70, 27)
    instantFunc2(80, 27)

    println(sum(1,2))
}