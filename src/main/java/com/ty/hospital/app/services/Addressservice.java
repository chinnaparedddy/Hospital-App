package com.ty.hospital.app.services;

import com.ty.hospital.app.dto.Address;

public interface Addressservice {

	Address saveAddress(int branch_id, Address address);

	boolean deleteAddress(int address_id);

	Address updateAddress(int address_id, Address address);

	Address getAddressById(int address_id);
}
