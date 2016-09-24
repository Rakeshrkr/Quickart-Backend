package com.ecommerce.quickart.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.ecommerce.quickart.dao.UserDetailsDao;
import com.ecommerce.quickart.model.UserDetails;

public class UserDetailsTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.ecommerce.quickart");
		context.refresh();
		
		UserDetailsDao userDetailsDao = (UserDetailsDao) context.getBean("userDetailsDao");
		UserDetails userDetails = (UserDetails) context.getBean("userDetails");
		
		 
		userDetails.setUserId("Mohit.kr");
		userDetails.setEmail("Mohit.iitb@gmail.com");
		userDetails.setMobilenumber("9967433830");
		Date date = null;
		try {
			date = new SimpleDateFormat("yyyy-MM-dd").parse("1995-10-01");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		userDetails.setdOB(date);
		userDetails.setGender("male");
		userDetails.setAddress("Powai, Mumbai");
		userDetails.setFullName("Mohit Kumar Regar");
		userDetails.setPassword("mohit123");
		//userDetails.setRoleId("Role_Admin");
		
		if(userDetails.getRoleId()==null){
			userDetails.setRoleId("Role_User");
		}
		else {
			userDetails.setRoleId("Role_Admin");
		}
		userDetailsDao.saveUserDetails(userDetails);
		System.out.println("New user details added with name "+ userDetails.getFullName());
	}

}
