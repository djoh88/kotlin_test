package com.example.kotlin_test.ex_garbage_collection

fun main() {

    var result = ""
    var i = 1

    while (i <= 100) {
        result += "$i"
        i+=1
    }

    println(result)

}