package com.example.shoppinglist.di

import com.example.shoppinglist.data.repository.ShopListRepositoryImpl
import com.example.shoppinglist.domain.repository.ShopListRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface DataModule {

    @Singleton
    @Binds
    fun bindsShopListRepository(
        shopListRepositoryImpl: ShopListRepositoryImpl
    ): ShopListRepository
}