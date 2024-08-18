package com.example.shoppinglist.data.repository

import com.example.shoppinglist.data.datasource.db.ShopItemDao
import com.example.shoppinglist.data.datasource.db.toDbModel
import com.example.shoppinglist.data.datasource.db.toEntity
import com.example.shoppinglist.domain.entity.ShopItem
import com.example.shoppinglist.domain.repository.ShopListRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ShopListRepositoryImpl @Inject constructor(
    private val shopItemDao: ShopItemDao
): ShopListRepository {
    override suspend fun getShopList(): List<ShopItem> {
        return shopItemDao.getShopList().map { it.toEntity() }
    }

    override suspend fun getShopItemById(id: Long): ShopItem? {
        shopItemDao.getShopItem(id)?.let {
            return it.toEntity()
        }
        throw IllegalArgumentException()

    }

    override suspend fun addShopItem(shopItem: ShopItem) {
        shopItemDao.saveShopItem(shopItem.toDbModel())
    }

    override suspend fun deleteShopItem(shopItem: ShopItem) {
        shopItemDao.deleteShopItem(shopItem.toDbModel())
    }

    override suspend fun updateShopItem(shopItem: ShopItem) {
        return shopItemDao.saveShopItem(shopItem.toDbModel())
    }
}