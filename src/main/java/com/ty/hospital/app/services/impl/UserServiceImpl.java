package com.ty.hospital.app.services.impl;

import java.util.List;

import com.ty.hospital.app.dao.impl.UserImpl;
import com.ty.hospital.app.dto.Person;
import com.ty.hospital.app.dto.User;
import com.ty.hospital.app.services.UserService;

public class UserServiceImpl implements UserService {

	UserImpl userImpl = new UserImpl();

	@Override
	public User updateUser(int user_id, User user) {
		return userImpl.updateUser(user_id, user);
	}

	@Override
	public boolean deleteUser(int user_id) {
		return userImpl.deleteUser(user_id);
	}

	@Override
	public User getUserById(int user_id) {
		return userImpl.getUserById(user_id);
	}

	@Override
	public List<User> getUserByRole(String user_role) {
		return userImpl.getUserByRole(user_role);
	}

	@Override
	public User validateUser(String user_email, String user_password) {
		return userImpl.validateUser(user_email, user_password);
	}

	@Override
	public List<User> getAllUsers() {
		return userImpl.getAllUsers();
	}

	@Override
	public User saveUser(int branch_id, User user) {
		return userImpl.saveUser(branch_id, user);
	}

}
