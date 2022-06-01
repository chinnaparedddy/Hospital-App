package com.ty.hospital.app.branch.user.control;

import com.ty.hospital.app.services.impl.UserServiceImpl;

public class TestuserDelete {

	public static void main(String[] args) {

		UserServiceImpl userServiceImpl =new UserServiceImpl();
		if(userServiceImpl.deleteUser(7)) {
			System.out.println("deleted");
		}else {
			System.out.println("not deleted");
		}
	}

}
