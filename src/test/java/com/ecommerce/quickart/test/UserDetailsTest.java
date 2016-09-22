package com.ecommerce.quickart.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
		
		 
		userDetails.setUserId("Rakesh.kr");
		userDetails.setEmail("jrakesh.iitb@gmail.com");
		userDetails.setMobilenumber("9967452830");
		userDetails.setdOB("05/02/1995");
		userDetails.setGender("male");
		userDetails.setAddress("Powai, Mumbai");
		userDetails.setFullName("Rakesh Kumar Regar");
		userDetails.setPassword("rakesh123");
		userDetails.setRoleId("Role_Admin");
		
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
