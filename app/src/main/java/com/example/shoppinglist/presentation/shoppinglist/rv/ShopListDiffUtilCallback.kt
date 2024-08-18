package com.example.shoppinglist.presentation.shoppinglist.rv

import androidx.recyclerview.widget.DiffUtil
import com.example.shoppinglist.domain.entity.ShopItem

object ShopListDiffUtilCallback: DiffUtil.ItemCallback<ShopItem>() {
    override fun areItemsTheSame(oldItem: ShopItem, newItem: ShopItem) = oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: ShopItem, newItem: ShopItem) = oldItem == newItem
}