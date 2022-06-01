package com.ty.hospital.app.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospital.app.dao.HospitalDao;
import com.ty.hospital.app.dto.Hospital;

public class Hospitalimpl implements HospitalDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Hospital saveHospital(Hospital hospital) {
		
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityTransaction.commit();
		return hospital;
	}

	public Hospital getHospitalById(int hospital_id) {
		
		Hospital hospital = entityManager.find(Hospital.class, hospital_id);
		return hospital;
	}

	public Hospital updateHospitalById(int hospital_id, Hospital hospital) {
		
		Hospital hospital1 = entityManager.find(Hospital.class, hospital_id);
		if (hospital1 != null) {
			hospital.setHospital_id(hospital_id);
			entityTransaction.begin();
			entityManager.merge(hospital);
			entityTransaction.commit();
			return hospital;
		} else {
			return null;
		}
	}

	public boolean deleteHospitalById(int hospital_id) {
		
		entityTransaction.begin();
		Hospital hospital = entityManager.find(Hospital.class, hospital_id);
		entityManager.remove(hospital);
		entityTransaction.commit();
		return true;
	}

}
