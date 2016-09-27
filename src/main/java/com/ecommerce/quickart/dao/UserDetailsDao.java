package com.ecommerce.quickart.dao;

import java.util.List;
import com.ecommerce.quickart.model.UserDetails;
public interface UserDetailsDao {
	
	public boolean saveUserDetails(UserDetails userDetails);
	public boolean updateUserDetails(UserDetails userDetails);
	public boolean deleteUserDetails(String userId);
	public UserDetails getUserDetails(String userId);
	public UserDetails isValidUser(String userId, String password);
	public List<UserDetails> UserList();

}
