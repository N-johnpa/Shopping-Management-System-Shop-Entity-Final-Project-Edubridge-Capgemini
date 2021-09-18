package com.shop.system.service;

import java.util.List;

import com.shop.system.entity.Shop;

public interface ShopService {

	List<Shop> getAllShops();
	
	Shop saveShop(Shop shop);
	
	
	Shop getShopById(Long id);
	Shop updateShop(Shop shop);
	
	
	void deleteShopById(Long id);
}
