package com.example.kotlin_test

import java.io.IOException
import kotlin.jvm.Throws

class KotlinThrow {

    fun throwIOException() {
        throw IOException("체크드 익셉션인 IOException 발생")

    }
}

fun main() {
    val javaThrow = JavaThrow()
    javaThrow.throwIOException()

    val kotlinThrow = KotlinThrow()
    kotlinThrow.throwIOException()

}