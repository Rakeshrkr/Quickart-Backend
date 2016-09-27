package com.ecommerce.quickart.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.ecommerce.quickart.dao.CategoryDao;
import com.ecommerce.quickart.model.Category;

import junit.framework.Assert;

public class CategoryTestCase {
    @Autowired
	AnnotationConfigApplicationContext context ;
    @Autowired
    CategoryDao categoryDao ;
    @Autowired
    Category category ;
    
    @Before
    public void init(){
    	context = new AnnotationConfigApplicationContext();
    	context.scan("com.ecommerce.quickart");
    	context.refresh();
    	category = (Category) context.getBean("category");
    	categoryDao = (CategoryDao) context.getBean("categoryDao");	
    	
    }
    @Test
    public void createCategoryTestCase(){
    	
    	category.setCategoryId(101);
    	category.setCategoryName("Sofa");
    	category.setDescription("This is new Sofa");
    	Assert.assertEquals("Create Category",true, categoryDao.saveCategory(category));
    	
    }
    @Test
    public void updateCategoryTestCase(){	

    	category.setCategoryId(101);
    	category.setCategoryName("White Sofa");
    	category.setDescription("This is new Sofa");
    	Assert.assertEquals("Update Category",true, categoryDao.updateCategory(category));
    	
    }
    @Test
    public void deleteCategoryTestCase(){
    	
    	Assert.assertEquals("delete Category",true, categoryDao.deleteCategory(101));
    }
    @Test
    public void getCategoryTestCase(){
    	
    	Assert.assertEquals("Get Category","Tshirt", categoryDao.getCategory(101).getCategoryName());
    }
    @Test
    public void listCategoryTestCase(){
    	
    	Assert.assertEquals("List Category",6, categoryDao.CategoryList().size());
    }
	
}
