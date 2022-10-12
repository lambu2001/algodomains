package com.product.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="category")
public class Category {
	
	@Id
	private String category;
	private double discount;
	private double gst;
	private double delivery;

}
