package com.shop.system.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shop.system.entity.Shop;
import com.shop.system.repository.ShopRepository;
import com.shop.system.service.ShopService;

@Service
public class ShopServiceImpl implements ShopService {

	private ShopRepository shopRepository;
	
	public ShopServiceImpl(ShopRepository shopRepository) {
		super();
		this.shopRepository = shopRepository;
	}

@Override
public List<Shop> getAllShops()
{
	return shopRepository.findAll();
}

@Override
public Shop saveShop(Shop shop) {
	
	return shopRepository.save(shop);
}

@Override
public Shop getShopById(Long id) {
	
	return shopRepository.findById(id).get();
}

@Override
public Shop updateShop(Shop shop) {
	
	return shopRepository.save(shop);
}

@Override
public void deleteShopById(Long id) {
	shopRepository.deleteById(id);
	
	
}

}
