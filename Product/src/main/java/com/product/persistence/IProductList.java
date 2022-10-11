package com.product.persistence;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.product.model.ProductList;

@Repository
public interface IProductList extends MongoRepository<ProductList, Integer> {
	
	ProductList getByProductId(int id);

}
