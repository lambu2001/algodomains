package com.product.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.product.model.Category;

@Repository
public interface ICategoryDetails extends MongoRepository<Category, String> {
	
	Category getByCategory(String name);

}
