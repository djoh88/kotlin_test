package com.example.kotlin_test.ex_it_identifier

fun main() {
    val instantFunc: (Int) -> Unit = { num: Int -> println(num) }
    val instantFunc2: (Int) -> Unit = { println(it) }

    instantFunc(33)
    instantFunc2(55)
}