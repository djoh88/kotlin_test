package com.example.kotlin_test.ex_role_of_heap

fun main() {

    val product: Product = createProduct()
    printProductInfo(product)
    processProduct(product)
    printProductInfo(product)

}

fun createProduct(): Product {
    val apple = Product()
    apple.name = "Apple"
    apple.price = 1000

    return apple
}

fun processProduct(product: Product) {
    product.price += 500
}

fun printProductInfo(product: Product) {
    println("이름:${product.name}")
    println("이름:${product.price}")

}