package com.ty.hospital.app.dao;

import java.util.List;

import com.ty.hospital.app.dto.User;

public interface UserDao {

	User saveUser(User user);
	User updateUser(int user_id, User user);
	boolean deleteUser(int user_id);
	User getUserById(int user_id);
	List<User> getUserByRole(String user_role);
	User validateUser(String user_email,String user_password);
	List<User> getAllUsers();
	
	      
}
