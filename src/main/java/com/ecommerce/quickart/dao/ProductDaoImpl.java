package com.ecommerce.quickart.dao;

import java.util.List;


import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecommerce.quickart.model.Product;


@Repository("productDao")
@Transactional
public class ProductDaoImpl implements ProductDao {
	@Autowired
	SessionFactory sessionFactory;
	
	public ProductDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public boolean addProduct(Product product) {	
		try{
		sessionFactory.getCurrentSession().save(product);
		}catch(Exception e){
			e.printStackTrace();
		}
		return true;
	}
	public boolean editProduct(Product product) {
		try{
		sessionFactory.getCurrentSession().update(product);
		}catch(Exception e){
			e.printStackTrace();
		}
		return true;
	}
	public boolean deleteProduct(int productId) {
		try{
		sessionFactory.getCurrentSession().delete(getProduct(productId));
		}catch(Exception e){
			e.printStackTrace();
		}
		return true;
	}
	public Product getProduct(int productId) {
		return sessionFactory.getCurrentSession().get(Product.class, productId);
	}
	public List<Product> getAllProduct() {
		 Query query = sessionFactory.getCurrentSession().createQuery("from Product") ;
		 List<Product> productList = query.list();
		 return productList ;
	}
}