package com.example.onlinemagazine.domain

import com.example.onlinemagazine.domain.model.ShopItemModel

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopList(): List<ShopItemModel> {
        return shopListRepository.getShopList()
    }
}