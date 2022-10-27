package com.example.onlinemagazine.domain

import com.example.onlinemagazine.domain.model.ShopItemModel

class GetShopItemByIdUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopItem(shopItemId: Int): ShopItemModel {
        return shopListRepository.getShopItem(shopItemId = shopItemId)
    }
}