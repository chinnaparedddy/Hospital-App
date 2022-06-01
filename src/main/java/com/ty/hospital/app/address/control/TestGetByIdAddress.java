package com.ty.hospital.app.address.control;
import com.ty.hospital.app.dto.Address;
import com.ty.hospital.app.services.impl.AddressServiceImpl;

public class TestGetByIdAddress {

	public static void main(String[] args) 
	{

		
			AddressServiceImpl addressServiceImpl=new AddressServiceImpl();
			Address address= addressServiceImpl.getAddressById(1);
			 if(address!=null) {
				 System.out.println(address.getAddress_id());
				 System.out.println(address.getStreet());
				 System.out.println(address.getState());
				 System.out.println(address.getCountry());
				 System.out.println(address.getPincode());
			 }else {
				 System.out.println("id not found");
			 }
	}

}
