package com.example.kotlin_test

fun main() {

    //immutable
    val currencyList = listOf("달러", "유로", "원")

    //mutable
//    val mutableCurrencyList = mutableListOf<String>()
//    mutableCurrencyList.add("유로")
//    mutableCurrencyList.add("달러")

    val mutableCurrencyList = mutableListOf<String>().apply {
        add("달러")
        add("유로")
    }

    // imumutable set
    val numberSet = setOf(1, 2, 3, 4)

    // mutable set
    val mutableSet = mutableSetOf<String>().apply {
        add("1")
        add("2")

    }

    // immutable map
    val numberMap = mapOf("one" to 1, "two" to 2)

    // mutable map
    val mutableNumberMap = mutableMapOf<String, Int>()
    mutableNumberMap["one"] = 1
    mutableNumberMap["two"] = 2

    // 컬렉션 빌더는 내부에선 mutable 반환은 immutable
//    val numberList = buildList{
//        add(1)
//        add(2)
//
//    }

    val interator = currencyList.iterator()
    while (interator.hasNext()) {
        println(interator.next())
    }
    println("----------------------")
    for (currency in currencyList) {
        println(currency)
    }
    println("----------------------")
    currencyList.forEach { println(it) }



}