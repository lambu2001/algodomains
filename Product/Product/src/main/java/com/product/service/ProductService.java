package com.product.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.model.ProductList;
import com.product.persistence.IProductList;


@Service
public class ProductService implements IProductService{
	
	@Autowired
	private IProductList repo;

	@Override
	public ProductList saveProduct(ProductList product) {
		if (product!=null)
			return repo.save(product);
		else
			return null;
	}

	@Override
	public ProductList getProductdetails(int id) {
		if (id>0)
			return repo.getByProductId(id);
		else
			return null;
	}
	

	
//	@Override
//	public ProductList saveProduct(ProductList product) {
//		
//	}
//	
//	@Override
//	public Optional<ProductList> getProductdetails(int id) {
//		
//	}

}
