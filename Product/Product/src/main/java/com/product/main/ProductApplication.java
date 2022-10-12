package com.product.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.product.controller.ProductController;
import com.product.service.CategoryService;
import com.product.service.ProductService;

@SpringBootApplication(scanBasePackages = "com.product")
@EnableMongoRepositories(basePackages = "com.product.persistence")
@ComponentScan(basePackageClasses = {ProductController.class,ProductService.class,CategoryService.class})
public class ProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}

}
