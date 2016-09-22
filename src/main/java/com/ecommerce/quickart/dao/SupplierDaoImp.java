package com.ecommerce.quickart.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecommerce.quickart.model.Supplier;
@Repository("supplierDao")
@Transactional
public class SupplierDaoImp implements SupplierDao{
	@Autowired
	SessionFactory sessionFactory ;

	public boolean saveSupplier(Supplier supplier) {
		try{
		sessionFactory.getCurrentSession().save(supplier);
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		return true ;
	}

	public boolean updateSupplier(Supplier supplier) {
		try{
			sessionFactory.getCurrentSession().update(supplier);
			}
			catch(Exception exception){
				exception.printStackTrace();
			}
			return true ;
	}

	public boolean deleteSupplier(String supplierId) {
		try{
			sessionFactory.getCurrentSession().delete(getSupplier(supplierId));
			}
			catch(Exception exception){
				exception.printStackTrace();
			}
			return true ;
	}

	public Supplier getSupplier(String supplierId) {
		String hql = "select from supplier where id = '" + supplierId + "'" ;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Supplier> supplierList = query.list();
		if(supplierList == null){
			return null ;
		}
		return supplierList.get(0);
		
	}

	public List<Supplier> SupplierList() {
		String hql = "select from supplier";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Supplier> supplierList = query.list();
		if(supplierList == null){
			return null ;
		}
		return supplierList ;
	}
	
}
