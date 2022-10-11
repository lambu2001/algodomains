package com.product.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.model.Category;
import com.product.model.ProductList;
import com.product.persistence.ICategoryDetails;

@Service
public class CategoryService implements ICategoryService {
	
	@Autowired
	ICategoryDetails catrepo;

	@Override
	public Category getCategoryDetails(String name) {
		return catrepo.getByCategory(name);
	}
	
	@Override
	public Category saveCategory(Category category) {
		if (category!=null)
			return catrepo.save(category);
		else
			return null;
	}

//	
//	@Override
//	public Optional<Category> getCategoryDetails(String name) {
//		
//	}
}
