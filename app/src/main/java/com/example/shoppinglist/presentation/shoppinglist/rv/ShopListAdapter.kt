package com.example.shoppinglist.presentation.shoppinglist.rv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.shoppinglist.R
import com.example.shoppinglist.domain.entity.ShopItem

class ShopListAdapter(
    private val onClick: (ShopItem) -> Unit
) : ListAdapter<ShopItem, ShopItemViewHolder>(ShopListDiffUtilCallback) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ShopItemViewHolder(layoutInflater.inflate(R.layout.item_shop, parent, false))
    }

    override fun onBindViewHolder(holder: ShopItemViewHolder, position: Int) {
        holder.onBind(getItem(position), onClick)
    }

}