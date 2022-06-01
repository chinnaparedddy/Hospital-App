package com.ty.hospital.app.control;

import com.ty.hospital.app.dto.User;
import com.ty.hospital.app.services.impl.UserServiceImpl;

public class TestUserValidate {

	public static void main(String[] args) {

		UserServiceImpl userServiceImpl=new UserServiceImpl();
		User user=userServiceImpl.validateUser("nari@gmail.com", "naresh1234");
		if(user!=null) {
			System.out.println(user.getUser_id());
			 System.out.println(user.getUser_name());
			 System.out.println(user.getUser_email());
			 System.out.println(user.getUser_phone());
			 System.out.println(user.getUser_password());
			 System.out.println("************************");
		}else {
			System.out.println("Data not found");
		}
	}

}
