package com.ecommerce.quickart.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecommerce.quickart.dao.ProductDao;
import com.ecommerce.quickart.model.Product;

public class ProductTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.ecommerce.quickart");
		context.refresh();
		
		ProductDao productDao = (ProductDao) context.getBean("productDao");
		Product product = (Product) context.getBean("product");
		
		product.setPrice(1500);
		product.setCategoryId("Clothes101");
		product.setProductId(14);
		product.setProductName("Jeans");
		product.setQuantity(15);
		product.setDescription("This is black jeans");
		product.setSupplierId("SUP101");
		
		productDao.addProduct(product);
		System.out.println("Product has been added with id "+ product.getProductId());
		
	}
	

}
