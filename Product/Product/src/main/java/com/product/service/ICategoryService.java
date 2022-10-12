package com.product.service;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.product.model.Category;

@Component
public interface ICategoryService {
	Category saveCategory(Category category);
	Category getCategoryDetails(String name);

}
