package com.product.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.Category;
import com.product.model.Charge;
import com.product.model.ProductDetails;
import com.product.model.ProductList;
import com.product.service.CategoryService;
import com.product.service.ProductService;


@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@Autowired
	private CategoryService catService;
	
	@GetMapping("/")
	public String hello() {
		return "hi this is working";
	}
	
	
	@PostMapping("/save")
	public ProductList saveProduct(@RequestBody ProductList product) {
		return service.saveProduct(product);
	}
	
	@PostMapping("/saveCategory")
	public Category saveCategory(@RequestBody Category category) {
		System.out.println("saving");
		return catService.saveCategory(category);
	}
	
	@PutMapping(path="/update")
	public ProductList updateProduct(@RequestBody ProductList product) {
		return service.updateProduct(product);
	}
	
	@DeleteMapping(path="/delete/{id}")
	public void deleteProduct(@PathVariable ("id") int prodId) {
		service.deleteProduct(prodId);
	}
	
	@GetMapping(path = "/product/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductDetails getProducts(@PathVariable ("id") int id) {
		
		ProductList item=service.getProductdetails(id);
		
		
		if(item!=null) {
			String cat=item.getCategory();
			Category categorydetails=catService.getCategoryDetails(cat);
			
			double dis=(categorydetails.getDiscount()*item.getBasePrice())/100;
			double del=categorydetails.getDelivery();
			double gs=(categorydetails.getGst()*(item.getBasePrice()-dis))/100;
			double finalp=item.getBasePrice()-dis+del+gs;
			
			ProductDetails prodetails=new ProductDetails(item.getProductId(),item.getName(),
					item.getProductType(),item.getCategory(),item.getBasePrice(),dis,
					new Charge(gs,del),finalp);
			return prodetails;
			
		}
		return null;
	}
	@DeleteMapping("/remove/{id}")
	public void removedetails(@PathVariable ("id") int id){
			Object removeFromProductList;
	
			
		}
	

}
