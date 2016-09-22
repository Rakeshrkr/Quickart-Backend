package com.ecommerce.quickart.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecommerce.quickart.dao.CategoryDao;
import com.ecommerce.quickart.model.Category;


public class CategoryTest {
	public static void main(String[] args) {
		//first u have to get dao and domain object instance
		// but without using new operator
		// get the context
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		//Ask context to get the instances/bean
		//you have to specify in which package the classes are there
		context.scan("com.ecommerce.quickart");
		context.refresh();
		CategoryDao categoryDao = (CategoryDao)context.getBean("categoryDao");//"c" is lower case 
		Category category = (Category)context.getBean("category");
		
		category.setCategoryId("Clothes101");
		category.setCategoryName("Tshirt");
		category.setDescription("This is black tshirt");
		categoryDao.saveCategory(category);
		
		System.out.println("Data inserted into DB");
		 
	}
	
	
}
