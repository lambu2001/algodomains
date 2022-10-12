package com.product.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDetails {
	
	private int productId;
	private String name;
	private String productType;
	private String category;
	private int basePrice;
	private double discount;
	private Charge charges;
	private double finalPrice;
}
