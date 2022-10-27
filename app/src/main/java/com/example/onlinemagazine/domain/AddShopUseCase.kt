package com.example.onlinemagazine.domain

import com.example.onlinemagazine.domain.model.ShopItemModel

class AddShopUseCase(private val shopListRepository: ShopListRepository) {

    fun addShopItem(shopItemModel: ShopItemModel) {
        shopListRepository.addShopItem(shopItemModel = shopItemModel)
    }
}