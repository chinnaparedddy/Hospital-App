package com.ty.hospital.app.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospital.app.dao.Addressdao;
import com.ty.hospital.app.dto.Address;
import com.ty.hospital.app.dto.Branch;

public class AddressImpl implements Addressdao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	@Override
	public Address saveAddress(int branch_id, Address address) {
		Branch branch=entityManager.find(Branch.class, branch_id);
		address.setBranch(branch);
		entityTransaction.begin();
		entityManager.persist(address);
		entityTransaction.commit();
		return address;
	}

	public boolean deleteAddress(int address_id) {
		entityTransaction.begin();
		Address address = entityManager.find(Address.class, address_id);
		if (address != null) {
			entityManager.remove(address);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

	public Address updateAddress(int address_id, Address address) {
		entityTransaction.begin();
		Address address1=entityManager.find(Address.class, address_id);
		if(address1!=null) {
			address.setAddress_id(address_id);
			entityManager.merge(address);
			entityTransaction.commit();
		}
		return null;
	}

	public Address getAddressById(int address_id) {
		Address address=entityManager.find(Address.class, address_id);
		return address;
	}

}
