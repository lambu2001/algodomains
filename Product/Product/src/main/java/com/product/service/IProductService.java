package com.product.service;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.product.model.ProductList;

@Component
public interface IProductService {
	
	ProductList saveProduct(ProductList product);
	ProductList getProductdetails(int id);
}
