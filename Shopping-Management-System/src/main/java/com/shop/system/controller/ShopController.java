package com.shop.system.controller;

import javax.management.AttributeValueExp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.shop.system.entity.Shop;
import com.shop.system.service.ShopService;

@Controller
public class ShopController {

	private ShopService shopService;

	public ShopController(ShopService shopService) {
		super();
		this.shopService = shopService;
	}
	
	//Handle method to handle list shops and return mode and View
	@GetMapping("/shops")
	public String listShops(Model model) {
		model.addAttribute("shops", shopService.getAllShops());
    return  "shops";   
	
	}
	@GetMapping("/shops/new")
	public String createShopForm(Model model) {
	
	//Create shop obj to hold hop form data	
		Shop shop = new Shop ();
		model.addAttribute("shop", shop);
	return "create_shop";
	}
@PostMapping("/shops")
public String saveShop(@ModelAttribute("shop") Shop shop) {
shopService .saveShop(shop);
return "redirect:/shops";
	
	
}

@GetMapping("/shops/edit/{id}")
public String editShopForm(@PathVariable Long id, Model model) {
	
	model.addAttribute("shop", shopService.getShopById(id));
	return "edit_shop";
}

@PostMapping("/shops/{id}")
public String updateShop(@PathVariable Long id,
		@ModelAttribute("shop")Shop shop,
		Model model) {
	
	//get shop from dataBase by ID
	Shop existingShop = shopService.getShopById(id);
	existingShop.setId(id);
	existingShop.setShopName(shop.getShopName());
	existingShop.setShopOwner(shop.getShopOwner());
	existingShop.setCategory(shop.getCategory());
	existingShop.setStatus(shop.getStatus());
	existingShop.setEmailId(shop.getEmailId());
	
	//save updated Shop object
	
	shopService.updateShop(existingShop);
	return "redirect:/shops";
	
	
}
//Handler method to delete Shop Request

@GetMapping("/shops/{id}")
public String deleteShop(@PathVariable Long id) {
	shopService.deleteShopById(id);
	return "redirect:/shops";
}




}
