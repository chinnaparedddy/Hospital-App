package com.ty.hospital.app.address.control;
import com.ty.hospital.app.dao.impl.AddressImpl;
import com.ty.hospital.app.dto.Address;
import com.ty.hospital.app.dto.Branch;

public class TestSaveAddress {

	public static void main(String[] args) {

		AddressImpl addressImpl=new AddressImpl();
		Address address=new Address();
		address.setStreet("ANANTAPUR");
		address.setState("Andhra Predesh");
		address.setCountry("India");
		address.setPincode(515701);
		//Branch branch=new Branch();
		//branch.setAddress(address);
		addressImpl.saveAddress(2, address);
		System.out.println("added");
	}

}
