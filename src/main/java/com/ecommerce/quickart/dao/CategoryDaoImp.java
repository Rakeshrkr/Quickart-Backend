package com.ecommerce.quickart.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.ecommerce.quickart.model.Category;
@Repository("categoryDao")
@Transactional
public class CategoryDaoImp implements CategoryDao{
	@Autowired
	private SessionFactory sessionFactory ;

	public CategoryDaoImp(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public boolean saveCategory(Category category) {
		try{
			sessionFactory.getCurrentSession().save(category);
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		
		}
		return true;
	}

	public boolean updateCategory(Category category) {
		try{
			sessionFactory.getCurrentSession().update(category);
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		
		}
		return true;
	}

	public boolean deleteCategory(String categoryId) {
		try{
			sessionFactory.getCurrentSession().delete(getCategory(categoryId));
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		
		}
		return true;
	}

	public Category getCategory(String categoryId) {
		String hql = "from category where id = '" + categoryId + "'" ;
		List<Category> categoryList = sessionFactory.getCurrentSession().createQuery(hql).list();
		if(categoryList == null){
		 return null ;	
		}
		else
		return categoryList.get(0);
	}

	public List<Category> CategoryList() {
		
		String hql = "from category" ;
		List<Category> categoryList = sessionFactory.getCurrentSession().createQuery(hql).list();
		if(categoryList == null){
		 return null ;	
		}
		else
		return categoryList ;
	}

}
