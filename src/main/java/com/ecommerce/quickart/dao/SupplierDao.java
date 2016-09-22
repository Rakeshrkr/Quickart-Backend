package com.ecommerce.quickart.dao;

import java.util.List;

import com.ecommerce.quickart.model.Supplier;


public interface SupplierDao {
	
	public boolean saveSupplier(Supplier supplier);
	public boolean updateSupplier(Supplier supplier);
	public boolean deleteSupplier(String supplierId);
	public Supplier getSupplier(String supplierId);
	public List<Supplier> SupplierList();

}
