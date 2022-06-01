package com.ty.hospital.app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital.app.dao.MedOrderDao;
import com.ty.hospital.app.dto.Encounter;
import com.ty.hospital.app.dto.MedOrder;

public class MedOrderImpl implements MedOrderDao{

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	public MedOrder saveMedOrder(int encounter_id, MedOrder medOrder) {
		entityTransaction.begin();
		Encounter encounter=entityManager.find(Encounter.class, encounter_id);
		if(encounter!=null) {
			medOrder.setEncounter(encounter);
			entityManager.persist(medOrder);
			entityTransaction.commit();
			return medOrder;
		}else {
		return null;
		}
	}
	public MedOrder getmedOrder(int medorder_id) {
		MedOrder medOrder=entityManager.find(MedOrder.class, medorder_id);
		return medOrder;
	}
	public MedOrder updateMedOrderById(int medorder_id, MedOrder medOrder) {
		MedOrder medOrder1=entityManager.find(MedOrder.class, medorder_id);
		if(medOrder1!=null) {
			entityManager.merge(medOrder);
			return medOrder;
		}else {
		return null;
		}
	}
	public List<MedOrder> getAllMedOrder() {
		String sql="select m from MedOrder m";
		Query query=entityManager.createQuery(sql);
		List<MedOrder> medOrders=query.getResultList();
		return medOrders;
	}
	public boolean deleteMedOrder(int medOrder_id) {
		MedOrder medOrder1=entityManager.find(MedOrder.class, medOrder_id);
		entityManager.remove(medOrder1);
		return true;
	}
	
	
}
