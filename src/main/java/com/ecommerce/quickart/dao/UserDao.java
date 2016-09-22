package com.ecommerce.quickart.dao;

import java.util.List;

import com.ecommerce.quickart.model.User;


public interface UserDao {
	public boolean saveUser(User user);
	public boolean updateUser(User user);
	public boolean deleteUser(String userId);
	public User getUser(String userId);
	public List<User> UserList();

}
