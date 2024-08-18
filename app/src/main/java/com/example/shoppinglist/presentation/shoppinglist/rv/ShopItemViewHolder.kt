package com.example.shoppinglist.presentation.shoppinglist.rv

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.shoppinglist.databinding.ItemShopBinding
import com.example.shoppinglist.domain.entity.ShopItem

class ShopItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    private val binding = ItemShopBinding.bind(itemView)

    fun onBind(model: ShopItem, onClick: (ShopItem) -> Unit) {
        with(binding) {
            name.text = model.name
            amount.text = model.toString()
        }
    }
}