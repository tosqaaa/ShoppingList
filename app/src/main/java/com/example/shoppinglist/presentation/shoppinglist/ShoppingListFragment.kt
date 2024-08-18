package com.example.shoppinglist.presentation.shoppinglist

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.shoppinglist.R
import com.example.shoppinglist.databinding.FragmentShoppingListBinding
import com.example.shoppinglist.presentation.shoppinglist.rv.ShopListAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ShoppingListFragment: Fragment(R.layout.fragment_shopping_list) {
    private var _binding: FragmentShoppingListBinding? = null
    private val binding get() = _binding!!

    private lateinit var shopListAdapter: ShopListAdapter
    private val viewModel: ShoppingListViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentShoppingListBinding.bind(view)

        viewModel.shopList.observe(viewLifecycleOwner) {
            binding.shopList.adapter = ShopListAdapter{
                Toast.makeText(context, "item clicked", Toast.LENGTH_SHORT).show()
            }.apply {
                submitList(emptyList())
            }
        }
    }
}