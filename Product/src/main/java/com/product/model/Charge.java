package com.product.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Charge {
	
	private double gst;
	private double delivery;
}
