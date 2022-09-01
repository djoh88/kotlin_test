fun main() {

//    val list = mutableListOf(printHello)
//    list[0]()

    call(printHello)

//    call (PrintNo) // fun으로 생성된 함수는 일급객체로 쓸 수 없다. 컴파일 오류 남

//    val result: Int = plus(1, 3)
//    println(result)

    /* 고차함수 호출 예제 */
//    val list = listOf<String>("a", "b", "c")
//    val printStr : (String) -> Unit = { println(it)}
//    forEachStr(list, printStr)

}

/*아래 람다 함수는 모두 동일 한 코드*/
//val printMessage: (String) -> Unit = {message: String -> println(message)}
//val printMessage2: (String) -> Unit = {message: String -> println(message)}
//val printMessage3: (String) -> Unit = {println(it)}

/*다수의 인자를 받아서 처리할 수 있는 람다 함수*/
//val plus : (Int, Int) -> Int = {a, b -> a + b}
//val plus2 : (Int, Int, Int) -> Int = {a,b,c -> a + b +c}

/* 고차 함수 : 함수를 인자로 받아서 처리 하는 함수 */
fun forEachStr(collection: Collection<String>, action: (String) -> Unit) {
    for (item in collection) {
        action(item)
    }
}

/* 익명함수 */

fun outerFunc(): () -> Unit {
//    return fun() {
//        println("이것은 익명함수!")
//    }
    //람다함수로 변환
    return {println("이것은 익명함수!")}
}

//fun outerFunc2(): () -> Unit {println("이것은 익명함수!")}




val printHello : () -> Unit ={ println("Hello")}
//일급객체, 즉 함수를 값으로 쓸 수 있다.
//val func1 : () -> Unit = {}
//val func2 : () -> String = {""}

// 함수를 인자로 받아 실행하는 함수
fun call(block: () -> Unit) {
    block()
}

fun PrintNo() = println("No!")
