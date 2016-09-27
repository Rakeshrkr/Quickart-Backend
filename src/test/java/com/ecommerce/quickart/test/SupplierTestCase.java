package com.ecommerce.quickart.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecommerce.quickart.dao.SupplierDao;
import com.ecommerce.quickart.model.Supplier;

import junit.framework.Assert;

public class SupplierTestCase {
	@Autowired
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	@Autowired
	SupplierDao supplierDao;
	@Autowired
	Supplier supplier;

	@Before
	public void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.ecommerce.quickart");
		context.refresh();
		supplierDao = (SupplierDao) context.getBean("supplierDao");
		supplier = (Supplier) context.getBean("supplier");

	}

	@Test
	public void createSupplierTestCase() {

		supplier.setSupplierId(303);
		supplier.setSupplierName("Suresh Goswami");
		supplier.setSupplierAddress("Sikar, Rajasthan");
		Assert.assertEquals("Create Supplier", true, supplierDao.saveSupplier(supplier));

	}

	@Test
	public void updateCategoryTestCase() {

		supplier.setSupplierId(303);
		supplier.setSupplierName("Manoj");
		supplier.setSupplierAddress("Sikar, Rajasthan");
		Assert.assertEquals("Update Supplier", true, supplierDao.updateSupplier(supplier));

	}

	@Test
	public void getSupplierTestCase() {

		Assert.assertEquals("Get Supplier", "Samitha Singh", supplierDao.getSupplier(303).getSupplierName());
	}

	@Test
	public void listSupplierTestCase() {

		Assert.assertEquals("List Supplier", 3, supplierDao.SupplierList().size());
	}

	@Test
	public void deleteSupplierTestCase() {

		Assert.assertEquals("delete Supplier", true, supplierDao.deleteSupplier(303));
	}

}
