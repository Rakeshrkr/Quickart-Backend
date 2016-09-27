package com.ecommerce.quickart.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecommerce.quickart.dao.CategoryDao;
import com.ecommerce.quickart.dao.ProductDao;
import com.ecommerce.quickart.dao.SupplierDao;
import com.ecommerce.quickart.model.Category;
import com.ecommerce.quickart.model.Product;
import com.ecommerce.quickart.model.Supplier;

public class ProductTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.ecommerce.quickart");
		context.refresh();
		
		
		Supplier supplier = (Supplier) context.getBean("supplier");
		Supplier supplier1 = (Supplier) context.getBean("supplier");
		SupplierDao supplierDao = (SupplierDao) context.getBean("supplierDao");
		
		supplier.setSupplierId(1002);
		supplier.setSupplierName("New Supplier");
		supplier.setSupplierAddress("New Address");
		supplierDao.saveSupplier(supplier);
		
		supplier1.setSupplierId(1001);
		supplier1.setSupplierName("New Supplier1");
		supplier1.setSupplierAddress("New Address1");
		supplierDao.saveSupplier(supplier1);
		
		/*--------------------------------------------------------*/

		
		CategoryDao categoryDao = (CategoryDao)context.getBean("categoryDao");
		Category category = (Category)context.getBean("category");
		category.setCategoryId(2002);
		category.setCategoryName("Jeans");
		category.setDescription("Only jeans");
		categoryDao.saveCategory(category);
		
		/*--------------------------------------------------------*/

		ProductDao productDao = (ProductDao) context.getBean("productDao");
		Product product = (Product) context.getBean("product");
		// ProductDao productDao1 = (ProductDao) context.getBean("productDao");
		Product product1 = (Product) context.getBean("product");

		product.setProductId(15);
		product.setDescription("Blue Jeans");
		product.setPrice(2560);
		product.setProductName("Jeans");
		product.setQuantity(5);
		product.setCategory(category);
		Supplier sup = supplierDao.getSupplier(1002);
		product.setSupplier(sup);
		productDao.addProduct(product);
		
		 product1.setProductId(12); product1.setDescription("Black Jeans");
		 product1.setPrice(2400); product1.setProductName("Jeans");
		 product1.setQuantity(3); product1.setCategory(category);
		 Supplier sup1 = supplierDao.getSupplier(1001);
		 product.setSupplier(sup1);

		 product1.setSupplier(supplier1); 
		 productDao.addProduct(product1);
		 

		/*--------------------------------------------------------*/

		System.out.println("Data inserted into DB");

	}

}
