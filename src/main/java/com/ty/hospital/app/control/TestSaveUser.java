package com.ty.hospital.app.control;

import com.ty.hospital.app.dto.Branch;
import com.ty.hospital.app.dto.User;
import com.ty.hospital.app.services.impl.UserServiceImpl;

public class TestSaveUser {

	public static void main(String[] args) {

		User user = new User();
		user.setUser_name("Lokesh");
		user.setUser_email("loki@gmail.com");
		user.setUser_password("loki1478");
		user.setUser_phone(7989452181l);
		user.setUser_role("Phigiotherapi");

		Branch branch = new Branch();
		user.setBranch(branch);
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		userServiceImpl.saveUser(1,user);

	}

}
