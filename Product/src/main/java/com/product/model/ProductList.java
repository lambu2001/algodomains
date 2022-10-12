package com.product.model;



import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection =  "productList")
public class ProductList {
	
	@Id
	private int productId;
	private String name;
	private String productType;
	private String category;
	private int basePrice;
	public String getCategory() {
		// TODO Auto-generated method stub
		return null;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public int getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(int basePrice) {
		this.basePrice = basePrice;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void getCategory(String category) {
		this.category = category;
	}

}
