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
	

}
