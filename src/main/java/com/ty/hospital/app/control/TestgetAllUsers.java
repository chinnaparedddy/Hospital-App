package com.ty.hospital.app.control;

import java.util.List;

import com.ty.hospital.app.dto.User;
import com.ty.hospital.app.services.impl.UserServiceImpl;

public class TestgetAllUsers {

	public static void main(String[] args) {

		UserServiceImpl userServiceImpl=new UserServiceImpl();
		 List<User> users=userServiceImpl.getAllUsers();
		 for(User user:users) {
			 System.out.println(user.getUser_id());
			 System.out.println(user.getUser_name());
			 System.out.println(user.getUser_email());
			 System.out.println(user.getUser_phone());
			 System.out.println(user.getUser_password());
			 System.out.println("************************");
		 }
	}

}
