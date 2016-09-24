package com.ecommerce.quickart.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.ecommerce.quickart.model.UserDetails;

@Repository("userDetailsDao")
@Transactional
public class UserDetailsDaoImp implements UserDetailsDao{

	@Autowired
	private SessionFactory sessionFactory ;
	public UserDetailsDaoImp(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public boolean saveUserDetails(UserDetails userDetails) {
		try{
			sessionFactory.getCurrentSession().save(userDetails);
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		
		}
		return true;
	}

	public boolean updateUserDetails(UserDetails userDetails) {
		try{
			sessionFactory.getCurrentSession().update(userDetails);
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		
		}
		return true;
	}

	public boolean deleteUserDetails(String userId) {
		try{
			sessionFactory.getCurrentSession().delete(getUserDetails(userId));
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		
		}
		return true;
	}

	public UserDetails getUserDetails(String userId) {
		String hql = "from UserDetails where userId = '" + userId + "'" ;
		Query query = sessionFactory.getCurrentSession().createQuery(hql) ;
		List<UserDetails> userdetailList = query.list();
		if(userdetailList == null){
		 return null ;	
		}
		else
		return userdetailList.get(0);
	}

	public List<UserDetails> UserList() {
		String hql = "from UserDetails" ;
		List<UserDetails> userdetailList = sessionFactory.getCurrentSession().createQuery(hql).list();
		if(userdetailList == null){
		 return null ;	
		}
		else
		return userdetailList ;
	}

}
