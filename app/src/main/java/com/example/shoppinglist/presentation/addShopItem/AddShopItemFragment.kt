package com.example.shoppinglist.presentation.addShopItem

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.shoppinglist.R
import com.example.shoppinglist.databinding.FragmentAddShopItemBinding
import com.example.shoppinglist.databinding.FragmentShoppingListBinding

class AddShopItemFragment: Fragment(R.layout.fragment_add_shop_item) {
    private var _binding: FragmentAddShopItemBinding? = null
    private val binding get() = _binding!!

    private val viewModel:

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        _binding = FragmentAddShopItemBinding.bind(view)
    }
}