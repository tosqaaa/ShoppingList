package com.example.shoppinglist.domain.entity

data class ShopItem(
    val id: Long,
    val name: String,
    val amount: Int,
    val enable: Boolean
)
