package com.example.kotlin_test.ex_consstructor

class Person constructor(name: String, age: Int) {

    val name: String
    val age: Int

    init {
        this.name = name
        this.age = age
    }
}

fun main() {
    val person = Person("홍길성", 46)
    println("person.name = ${person.name}")
    println("person.age = ${person.age}")
}