package com.example.kotlin_test

enum class PaymentStatus(val label: String) : Payable{
    UNPAID("미지급"){override fun isPayable(): Boolean = true},
    PAID("지급완료"){override fun isPayable(): Boolean = false},
    FAILED("지급실패"){override fun isPayable(): Boolean = false},
    REFUNDED("환불"){override fun isPayable(): Boolean = false}; // 함수를 지정하기 위해 세미콜론(;)을 넣고 함수를 작성해야함
//    abstract fun isPayable() : Boolean
}

interface Payable {
    fun isPayable(): Boolean
}

fun main() {
    if (PaymentStatus.UNPAID.isPayable()) {
        print("결제 가능 상태")
    }
}