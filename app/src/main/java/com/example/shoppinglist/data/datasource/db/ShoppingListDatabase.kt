package com.example.shoppinglist.data.datasource.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.shoppinglist.domain.entity.ShopItem

@Database(
    version = 1,
    entities = [ShopItemDbModel::class]
)
abstract class ShoppingListDatabase: RoomDatabase() {
    abstract fun getShopItemDao(): ShopItemDao
}