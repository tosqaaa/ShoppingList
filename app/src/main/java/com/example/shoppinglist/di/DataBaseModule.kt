package com.example.shoppinglist.di

import android.content.Context
import androidx.room.Room
import com.example.shoppinglist.data.datasource.db.ShopItemDao
import com.example.shoppinglist.data.datasource.db.ShoppingListDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataBaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): ShoppingListDatabase {
        return Room.databaseBuilder(
            context,
            ShoppingListDatabase::class.java,
            "shopping_list.db"
        ).build()
    }
    @Provides
    fun provideShopItemDao(database: ShoppingListDatabase): ShopItemDao {
        return database.getShopItemDao()
    }
}