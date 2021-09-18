package com.shop.system.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "shops")
public class Shop {
	
	
	@javax.persistence.Id
	@GeneratedValue(strategy =   GenerationType.IDENTITY)
	
	private Long Id;
	
	@Column(name = "ShopName", nullable = false)
	private String ShopName;
	
	@Column(name = "ShopOwner")
    private String ShopOwner;
	
	@Column(name = "Category")
    private String Category;
	
	@Column(name = "Status")
    private String Status;
	
	@Column(name = "EmailId")
    private String EmailId;
    
    public Shop() {
    	
    }
    
    public Shop(String shopName, String shopOwner, String category, String status, String emailId) {
		super();
		ShopName = shopName;
		ShopOwner = shopOwner;
		Category = category;
		Status = status;
		EmailId = emailId;
	}
    
    
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getShopName() {
		return ShopName;
	}
	public void setShopName(String shopName) {
		ShopName = shopName;
	}
	public String getShopOwner() {
		return ShopOwner;
	}
	public void setShopOwner(String shopOwner) {
		ShopOwner = shopOwner;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	
    
    

}
