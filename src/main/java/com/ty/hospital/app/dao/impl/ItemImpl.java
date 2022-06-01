package com.ty.hospital.app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospital.app.dao.ItemDao;
import com.ty.hospital.app.dto.Item;
import com.ty.hospital.app.dto.MedOrder;

public class ItemImpl implements ItemDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Item saveItem(int medOrder_id, Item item) {
		entityTransaction.begin();
		MedOrder medOrder = entityManager.find(MedOrder.class, medOrder_id);
		if (medOrder != null) {
			
			entityManager.persist(item);
			entityTransaction.commit();
			return item;
		} else {
			return null;
		}
	}

	public Item getItemById(int item_id) {
		Item item = entityManager.find(Item.class, item_id);

		return item;
	}

	public Item updateItemById(int item_id, Item item) {
		entityTransaction.begin();
		Item item1 = entityManager.find(Item.class, item_id);
		if (item1 != null) {
			entityManager.merge(item);
			entityTransaction.commit();
			return item;
		} else {
			return null;
		}
	}

	public boolean deleteItemById(int item_id) {
		Item item = entityManager.find(Item.class, item_id);
		if (item != null) {
			entityManager.remove(item);
			return true;
		} else {
			return false;
		}
	}

	public List<Item> getAllItemsByMedOrderId(int medOrder_id) {
		MedOrder medOrder = entityManager.find(MedOrder.class, medOrder_id);
		if(medOrder!=null) {
		List<Item> items = medOrder.getItems();
		return items;
		}else {
			return null;
		}
	}

}
