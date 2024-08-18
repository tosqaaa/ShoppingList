package com.example.shoppinglist.domain.interactor

import com.example.shoppinglist.domain.entity.ShopItem
import com.example.shoppinglist.domain.repository.ShopListRepository
import javax.inject.Inject


class ShopListInteractor @Inject constructor(
    private val shopListRepository: ShopListRepository
) {
    suspend fun getShopList(): List<ShopItem> {
        return shopListRepository.getShopList()
    }

    suspend fun getShopItemById(id: Long): ShopItem? {
        return shopListRepository.getShopItemById(id)
    }

    suspend fun addShopItem(shopItem: ShopItem) {
        shopListRepository.addShopItem(shopItem)
    }

    suspend fun deleteShopItem(shopItem: ShopItem) {
        shopListRepository.deleteShopItem(shopItem)
    }

    suspend fun updateShopItem(shopItem: ShopItem) {
        return shopListRepository.updateShopItem(shopItem)
    }
}