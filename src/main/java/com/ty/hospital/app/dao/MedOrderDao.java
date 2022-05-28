package com.ty.hospital.app.dao;

import java.util.List;

import com.ty.hospital.app.dto.MedOrder;

public interface MedOrderDao {

	MedOrder saveMedOrder(int encounter_id,MedOrder medOrder);
	MedOrder getmedOrder(int medorder_id);
	MedOrder updateMedOrderById(int medorder_id,MedOrder medOrder);
	List<MedOrder> getAllMedOrder();
	boolean deleteMedOrder(int medOrder_id);
}
