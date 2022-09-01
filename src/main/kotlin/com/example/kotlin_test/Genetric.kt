package com.example.kotlin_test

//class MyGenerics<T>(val t: T){}
class MyGenerics<out T>(val t: T){}

fun main() {
    // 제네릭을 사용한 클래스의 인서턴스를 만들려면 타입 아규먼트를 제공
    val generics = MyGenerics<String>("텍스트")
    //공변성 구현
    val charGenerics: MyGenerics<CharSequence> = generics

    /*// 생략가능
    val generics = MyGenerics("텍스트")

    //변수의 타입에 제네릭을 사용한 경우

    val list1: MutableList<String> = mutableListOf()

    val list3: List<*> = listOf<String>("테스트")
    val list4: List<*> = listOf<Int>(1, 2, 3, 4)
*/

    // PECS(Proudcer-Extends, Cosumer-Super)
    // 공변성은 자바 제네릭의 extends 코틀린에선 out
    // 반공변성은 자바 제네릭의 super 코틀린에선 in

}