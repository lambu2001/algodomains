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
	public int getDiscount() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getGst() {
		return gst;
	}
	public void setGst(double gst) {
		this.gst = gst;
	}
	public double getDelivery() {
		return delivery;
	}
	public void setDelivery(double delivery) {
		this.delivery = delivery;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}

}
