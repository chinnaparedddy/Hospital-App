package com.ty.hospital.app.dao;

import com.ty.hospital.app.dto.Address;

public interface Addressdao {

	Address saveAddress(int branch_id, Address address);

	boolean deleteAddress(int address_id);

	Address updateAddress(int address_id, Address address);

	Address getAddressById(int address_id);
}
