package com.example.onlinemagazine.domain

import com.example.onlinemagazine.domain.model.ShopItemModel

class EditShopUseCase(private val shopListRepository: ShopListRepository) {
    fun editShopItem(shopItemModel: ShopItemModel) {
        shopListRepository.editShopItem(shopItemModel = shopItemModel)
    }
}