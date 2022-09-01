package com.example.kotlin_test

fun getSumOf(vararg numbers: Int): Int {

    val count = numbers.size;
    var i = 0;
    var sum = 0;

    while (i < count) {
        sum += numbers[i]
        i += 1
    }
    return sum
}

fun main() {
    println(getSumOf(1,2,34,5,6,7,8,9))

}

