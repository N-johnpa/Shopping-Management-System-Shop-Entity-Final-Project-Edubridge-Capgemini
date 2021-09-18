package com.shop.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.shop.system.entity.Shop;



public interface ShopRepository extends JpaRepository<Shop, Long> {

}
