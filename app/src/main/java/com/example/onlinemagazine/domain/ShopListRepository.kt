package com.example.onlinemagazine.domain

import com.example.onlinemagazine.domain.model.ShopItemModel

interface ShopListRepository {
    fun addShopItem(shopItemModel: ShopItemModel)

    fun deleteShopItem(shopItemModel: ShopItemModel)

    fun editShopItem(shopItemModel: ShopItemModel)

    fun getShopItem(shopItemId: Int): ShopItemModel

    fun getShopList(): List<ShopItemModel>
}