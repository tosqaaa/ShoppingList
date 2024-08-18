package com.example.shoppinglist.data.datasource.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import javax.inject.Inject


@Dao
interface ShopItemDao {
    @Upsert
    suspend fun saveShopItem(shopItem: ShopItemDbModel)

    @Delete
    suspend fun deleteShopItem(shopItem: ShopItemDbModel)

    @Query("SELECT * FROM shopping_items WHERE id=:id LIMIT 1")
    suspend fun getShopItem(id: Long): ShopItemDbModel?

    @Query("SELECT * FROM SHOPPING_ITEMS")
    suspend fun getShopList(): List<ShopItemDbModel>
}