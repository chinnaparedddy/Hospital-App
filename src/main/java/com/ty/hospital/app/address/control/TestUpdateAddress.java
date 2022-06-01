package com.ty.hospital.app.address.control;
import com.ty.hospital.app.dto.Address;
import com.ty.hospital.app.services.impl.AddressServiceImpl;

public class TestUpdateAddress {

	
	public static void main(String[] args) {

		AddressServiceImpl addressServiceImpl=new AddressServiceImpl();
		Address address=new Address();
		address.setStreet("Rajajinagar");
		address.setState("Karnataka");
		address.setCountry("Indai");
		address.setPincode(515601);
		addressServiceImpl.updateAddress(1, address);
	}

}
