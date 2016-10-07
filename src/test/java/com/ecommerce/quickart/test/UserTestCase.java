package com.ecommerce.quickart.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
import com.ecommerce.quickart.dao.UserDao;
import com.ecommerce.quickart.model.User;
*/
import junit.framework.Assert;

public class UserTestCase {
/*
	@Autowired
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	@Autowired
	UserDao userDao;
	@Autowired
	User user;

	@Before
	public void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.ecommerce.quickart");
		context.refresh();
		userDao = (UserDao) context.getBean("userDao");
		user = (User) context.getBean("user");

	}
	@Test
	public void createUserTestCase() {

		user.setUserId("subham.rs");
		user.setPassword("password@123");
		user.setRoleId("ROLE_USER");
		Assert.assertEquals("Create User", true, userDao.saveUser(user));

	}
	@Test
	public void updateUserTestCase() {

		user.setUserId("subham.rs");
		user.setPassword("password@123");
		user.setRoleId("ROLE_USER");
		Assert.assertEquals("Update User", true, userDao.updateUser(user));

	}
	@Test
	public void getUserTestCase() {

		Assert.assertEquals("Get User", "password@123", userDao.getUser("subham.rs").getPassword());
	}
	@Test
	public void listUserTestCase() {

		Assert.assertEquals("List User", 1, userDao.UserList().size());
	}
	@Test
	public void deleteUserTestCase() {

		Assert.assertEquals("delete User", true, userDao.deleteUser("subham.rs"));
	}*/

}
