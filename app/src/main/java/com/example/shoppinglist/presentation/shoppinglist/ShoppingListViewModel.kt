package com.example.shoppinglist.presentation.shoppinglist

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.shoppinglist.domain.entity.ShopItem
import com.example.shoppinglist.domain.interactor.ShopListInteractor
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ShoppingListViewModel @Inject constructor(
    private val shopListInteractor: ShopListInteractor
) : ViewModel() {
    private var _shopList = MutableLiveData<List<ShopItem>>()
    val shopList get() = _shopList

    init {
        loadShopList()
    }

    private fun loadShopList() {
        viewModelScope.launch {
            _shopList.postValue(
                shopListInteractor.getShopList()
            )
        }
    }
}