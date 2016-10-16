package com.ecommerce.quickart.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecommerce.quickart.dao.CategoryDao;
import com.ecommerce.quickart.dao.ProductDao;
import com.ecommerce.quickart.dao.SupplierDao;
import com.ecommerce.quickart.model.Category;
import com.ecommerce.quickart.model.Product;
import com.ecommerce.quickart.model.Supplier;


public class CategoryTest {
	private static final Logger logger = LoggerFactory.getLogger(CategoryTest.class);
	public static void main(String[] args) {
		//first u have to get dao and domain object instance
		// but without using new operator
		// get the context
		logger.info("Starting of Category Test");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		//Ask context to get the instances/bean
		//you have to specify in which package the classes are there
		context.scan("com.ecommerce.quickart");
		context.refresh();
		
		CategoryDao categoryDao = (CategoryDao)context.getBean("categoryDao");
		Category category = (Category)context.getBean("category");
		category.setCategoryId(2004);
		category.setCategoryName("Tshirts");
		category.setDescription("Only Tshirts");
		categoryDao.saveCategory(category);
		
		System.out.println("Data inserted into DB");
		 
	}
	
	
}
