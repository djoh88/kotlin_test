package com.example.kotlin_test.ex_member_function

class Building {
    
    var name = ""
    var date = ""
    var area = 0

    override fun toString(): String {
        return super.toString()
    }
    fun print() {
        println("this.name = ${this.name}")
        println("this.date = ${this.date}")
        println("this.area = ${this.area}")
    }
}

fun main() {
    val building = Building()
    building.name = "오피스텔"
    building.date = "2017-12-13"
    building.area = 120 * 8

    building.print()
}