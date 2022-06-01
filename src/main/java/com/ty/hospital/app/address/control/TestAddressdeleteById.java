package com.ty.hospital.app.address.control;

import com.ty.hospital.app.services.impl.AddressServiceImpl;

public class TestAddressdeleteById {

	public static void main(String[] args) {

		
		AddressServiceImpl addressServiceImpl=new AddressServiceImpl();
		boolean flag=addressServiceImpl.deleteAddress(1);
		if(flag) {
			System.out.println("deleted");
		}else {
			System.out.println("not deleted");
		}
	}

}
