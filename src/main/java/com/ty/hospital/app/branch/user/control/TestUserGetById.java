package com.ty.hospital.app.branch.user.control;

import com.ty.hospital.app.dto.User;
import com.ty.hospital.app.services.impl.UserServiceImpl;

public class TestUserGetById {

	public static void main(String[] args) {

		UserServiceImpl userServiceImpl = new UserServiceImpl();
		User user = userServiceImpl.getUserById(4);
		if(user!=null) {
			System.out.println(user.getUser_id());
			System.out.println(user.getUser_name());
			System.out.println(user.getUser_password());
			System.out.println(user.getUser_phone());
			System.out.println(user.getUser_email());
			System.out.println(user.getUser_role());
			System.out.println("**************************");
		}
	}

}
