package com.ecommerce.quickart.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecommerce.quickart.dao.SupplierDao;
import com.ecommerce.quickart.model.Supplier;

public class SupplierTest {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.ecommerce.quickart");
		context.refresh();
		SupplierDao supplierDao = (SupplierDao) context.getBean("supplierDao");
		Supplier supplier = (Supplier) context.getBean("supplier");
		
		supplier.setSupplierId(1003);
		supplier.setSupplierName("Kalpesh");
		supplier.setSupplierAddress("Hiranandani Powai");
		
		boolean ifSupplierSaved = supplierDao.saveSupplier(supplier);
		System.out.println("is new Supplier added ? = " + ifSupplierSaved );
	}

}
