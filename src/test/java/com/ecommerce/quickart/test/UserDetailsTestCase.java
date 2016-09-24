package com.ecommerce.quickart.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.ecommerce.quickart.dao.UserDetailsDao;
import com.ecommerce.quickart.model.UserDetails;

import junit.framework.Assert;

public class UserDetailsTestCase {

	@Autowired
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	@Autowired
	UserDetailsDao userDetailsDao;
	@Autowired
	UserDetails userDetails;

	@Before
	public void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.ecommerce.quickart");
		context.refresh();
		userDetailsDao = (UserDetailsDao) context.getBean("userDetailsDao");
		userDetails = (UserDetails) context.getBean("userDetails");

	}

	@Test
	public void createUserDetailsTestCase() {

		userDetails.setUserId("subham.rs");
		userDetails.setAddress("Andheri west");
		Date date = null;
		try {
			date = new SimpleDateFormat("yyyy-MM-dd").parse("1995-10-01");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		userDetails.setdOB(date);
		userDetails.setEmail("subham101@gmail.com");
		userDetails.setFullName("Subham Dawande");
		userDetails.setGender("male");
		userDetails.setMobilenumber("9967909090");
		userDetails.setPassword("password@123");
		userDetails.setRoleId("ROLE_USER");
		Assert.assertEquals("Create UserDetails", true, userDetailsDao.saveUserDetails(userDetails));

	}

	@Test
	public void updateUserDetailsTestCase() {

		userDetails.setUserId("subham.rs");
		userDetails.setAddress("Andheri west");
		Date date = null;
		try {
			date = new SimpleDateFormat("yyyy-MM-dd").parse("1995-08-01");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		userDetails.setdOB(date);
		userDetails.setEmail("subham101@gmail.com");
		userDetails.setFullName("Subham Dawande");
		userDetails.setGender("male");
		userDetails.setMobilenumber("9967909090");
		userDetails.setPassword("password@123");
		userDetails.setRoleId("ROLE_USER");
		Assert.assertEquals("Create UserDetails", true, userDetailsDao.updateUserDetails(userDetails));

	}

	@Test
	public void getUserDetailsTestCase() {

		Assert.assertEquals("Get User", "Mohit Kumar Regar", userDetailsDao.getUserDetails("Mohit.kr").getFullName());
	}

	@Test
	public void getUserDetailsListTestCase() {

		Assert.assertEquals("Get User List", 3, userDetailsDao.UserList().size());
	}

	@Test
	public void deleteUserDetailsTestCase() {

		Assert.assertEquals("delete UserDetails", true, userDetailsDao.deleteUserDetails("Mohit.kr"));
	}

}
