package com.ty.hospital.app.branch.user.control;

import com.ty.hospital.app.dto.User;
import com.ty.hospital.app.services.impl.UserServiceImpl;

public class TestUserUpdate {

	public static void main(String[] args) {

		User user =new User();
		user.setUser_name("somesh");
		user.setUser_email("somu@gmail.com");
		user.setUser_password("somus1478");
		user.setUser_phone(798645312l);
		user.setUser_role("arthospecilist");
		UserServiceImpl userServiceImpl=new UserServiceImpl();
		userServiceImpl.updateUser(11, user);
	}

}
