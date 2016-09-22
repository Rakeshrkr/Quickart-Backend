package com.ecommerce.quickart.dao;

import java.util.List;

import com.ecommerce.quickart.model.Category;

public interface CategoryDao {
	public boolean saveCategory(Category category);
	public boolean updateCategory(Category category);
	public boolean deleteCategory(String categoryId);
	public Category getCategory(String categoryId);
	public List<Category> CategoryList();

}
