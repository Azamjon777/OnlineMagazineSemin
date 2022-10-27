package com.example.onlinemagazine.data

import com.example.onlinemagazine.domain.ShopListRepository
import com.example.onlinemagazine.domain.model.ShopItemModel

object ShopListRepositoryImpl : ShopListRepository {

    private val shopList = mutableListOf<ShopItemModel>()
    private var autoIncrementId = 0

    override fun addShopItem(shopItemModel: ShopItemModel) {
        if (shopItemModel.id == ShopItemModel.UNDEFINED_ID){
            shopItemModel.id = autoIncrementId
            autoIncrementId++
        }else{
            shopList.add(shopItemModel)
        }
    }

    override fun deleteShopItem(shopItemModel: ShopItemModel) {
        shopList.remove(shopItemModel)
    }

    override fun editShopItem(shopItemModel: ShopItemModel) {
        val oldElement = getShopItem(shopItemModel.id)
        shopList.remove(oldElement)
        addShopItem(shopItemModel)
    }

    override fun getShopItem(shopItemId: Int): ShopItemModel {
        return shopList.find {
            it.id == shopItemId
        } ?: throw RuntimeException("Element with id $shopItemId not found")
    }

    override fun getShopList(): List<ShopItemModel> {
        return shopList.toList()
    }

}