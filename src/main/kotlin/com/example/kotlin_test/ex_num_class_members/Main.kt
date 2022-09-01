package com.example.kotlin_test.ex_num_class_members

enum class Mode(val number: Int){
    SELECTION(0),
    PEN(1),
    SHAPE(2),
    ERASER(3);

    fun printNumber() {
        println("모드: $number")
    }
}

fun main() {
    val mode:Mode = Mode.ERASER
    println(mode.number)


}