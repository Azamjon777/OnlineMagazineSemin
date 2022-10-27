package com.example.onlinemagazine.domain

import com.example.onlinemagazine.domain.model.ShopItemModel

class DeleteShopUseCase(private val shopListRepository: ShopListRepository) {
    fun deleteShopItem(shopItemModel: ShopItemModel) {
        shopListRepository.deleteShopItem(shopItemModel = shopItemModel)
    }
}