package com.example.kotlin_test

import org.springframework.web.bind.annotation.*
import java.lang.Exception


object HeaderKey {const val deviceId = "x-tosspayments-device-id" }

fun deleteList( shopId: String?, cartItemIds: List<Long>?) {
    //shopId가 null 로 들어옴
    cartItemIds?.let {
        println("cartItemIds:  $it")
    } ?: shopId?.let {
        println("shopid : $it")
    } ?: throw Exception("null이 올 수 없습니다.")
}

@RestController
@RequestMapping("/api/v1/carts")
class DefaultController {

    @GetMapping
    fun cartItem(
        @RequestParam(required = false, name = "cartItemId") cartItemIds: List<Long>?,
        @RequestParam(required = false) shopId: String?,
//        @RequestAttribute(HeaderKey.deviceId) userId: String
    ): String {

        println("shopId = $shopId")
        println("cartItemId = $cartItemIds")
//        println("userId = $userId")
        deleteList(shopId, cartItemIds)

        return "success"

    }
}
