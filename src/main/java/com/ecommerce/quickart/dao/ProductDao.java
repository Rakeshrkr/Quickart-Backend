package com.ecommerce.quickart.dao;

import java.util.List;
import com.ecommerce.quickart.model.Product;
	public interface ProductDao {
		 public boolean addProduct(Product product);
		 public boolean editProduct(Product product);
		 public boolean deleteProduct(int productId);
		 public Product getProduct(int productId);
		 public List<Product> getAllProduct();
}
