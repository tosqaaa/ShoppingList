package com.example.shoppinglist.data.datasource.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.shoppinglist.domain.entity.ShopItem

@Entity(tableName = "shopping_items")
data class ShopItemDbModel(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val name: String,
    val amount: Int,
    val enable: Boolean
)

fun ShopItemDbModel.toEntity(): ShopItem =
    ShopItem (
        id = this.id,
        name = this.name,
        amount = this.amount,
        enable = this.enable
    )

fun ShopItem.toDbModel(): ShopItemDbModel =
    ShopItemDbModel(
        id = this.id,
        name = this.name,
        amount = this.amount,
        enable = this.enable
    )