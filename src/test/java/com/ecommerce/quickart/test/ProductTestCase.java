package com.ecommerce.quickart.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import com.ecommerce.quickart.dao.ProductDao;
//import com.ecommerce.quickart.model.Product;

import junit.framework.Assert;

public class ProductTestCase {
/*
	@Autowired
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	@Autowired
	ProductDao productDao;
	@Autowired
	Product product;

	@Before
	public void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.ecommerce.quickart");
		context.refresh();
		productDao = (ProductDao) context.getBean("productDao");
		product = (Product) context.getBean("product");

	}

	@Test
	public void createProductTestCase() {

		//.setSupplierId("suresh101");
		//product.setCategoryId("cloths501");
		product.setDescription("This is blue tshirt");
		product.setPrice(1209);
		product.setProductId(800);
		product.setQuantity(6);
		product.setProductName("tshirt XL");
		Assert.assertEquals("Create Product", true, productDao.addProduct(product));

	}

	@Test
	public void updateProductTestCase() {

		//product.setSupplierId("suresh101");
		//product.setCategoryId("cloths501");
		product.setDescription("This is blue tshirt");
		product.setPrice(1209);
		product.setProductId(777);
		product.setQuantity(6);
		product.setProductName("tshirt XXL");
		Assert.assertEquals("Create Product", true, productDao.editProduct(product));

	}

	@Test
	public void getProductTestCase() {

		Assert.assertEquals("Get Product", "tshirt XXL", productDao.getProduct(777).getProductName());
	}

	@Test
	public void listProductTestCase() {

		Assert.assertEquals("Product Supplier", 7, productDao.getAllProduct().size());
	}

	@Test
	public void deleteProductTestCase() {

		Assert.assertEquals("delete Product", true, productDao.deleteProduct(0));
	}
*/
}
