package com.example.shoppinglist.presentation.addShopItem

import androidx.lifecycle.ViewModel
import com.example.shoppinglist.data.datasource.db.ShopItemDbModel
import com.example.shoppinglist.domain.entity.ShopItem
import com.example.shoppinglist.domain.interactor.ShopListInteractor
import dagger.hilt.android.lifecycle.HiltViewModel

@HiltViewModel
class AddShopItemViewModel(
    private val shopListInteractor: ShopListInteractor
): ViewModel() {

    fun saveShopItem() {
        val shopItem = ShopItemDbModel(
            id = 1,
            name =
        )
    }
}