package com.ecommerce.quickart.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecommerce.quickart.dao.UserDao;
import com.ecommerce.quickart.model.User;

public class UserTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.ecommerce.quickart");
		context.refresh();
		
		User user = (User) context.getBean("user");
		UserDao userDao = (UserDao) context.getBean("userDao");
		user.setUserId("Rakesh.kr");
		user.setPassword("rakesh123");
		user.setRoleId("Role_Admin");
		
		boolean ifUserAdded = (boolean)userDao.saveUser(user);
		
		System.out.println("User has been added with user id "+ user.getUserId() + " ?" + ifUserAdded);
	}

}
