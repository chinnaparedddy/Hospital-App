package com.ty.hospital.app.services.impl;

import com.ty.hospital.app.dao.impl.AddressImpl;
import com.ty.hospital.app.dto.Address;
import com.ty.hospital.app.services.Addressservice;

public class AddressServiceImpl implements Addressservice {

	AddressImpl addressseImpl=new AddressImpl();
	public Address saveAddress(int branch_id, Address address) {
		return addressseImpl.saveAddress(branch_id, address);
	}

	public boolean deleteAddress(int address_id) {
		return addressseImpl.deleteAddress(address_id);
	}

	public Address updateAddress(int address_id, Address address) {
		return addressseImpl.updateAddress(address_id, address);
	}

	public Address getAddressById(int address_id) {
		return addressseImpl.getAddressById(address_id);
	}

}
