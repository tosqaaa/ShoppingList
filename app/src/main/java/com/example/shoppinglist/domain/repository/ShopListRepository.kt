package com.example.shoppinglist.domain.repository

import com.example.shoppinglist.domain.entity.ShopItem


interface ShopListRepository {
    suspend fun getShopList(): List<ShopItem>
    suspend fun getShopItemById(id: Long): ShopItem?
    suspend fun addShopItem(shopItem: ShopItem)
    suspend fun deleteShopItem(shopItem: ShopItem)
    suspend fun updateShopItem(shopItem: ShopItem)
}