package com.ty.hospital.app.services.impl;

import java.util.List;

import com.ty.hospital.app.dao.impl.MedOrderImpl;
import com.ty.hospital.app.dto.MedOrder;
import com.ty.hospital.app.services.MedOrderService;

public class MedOrderServiceImpl implements MedOrderService{
	MedOrderImpl medOrderImpl=new MedOrderImpl();
	public MedOrder saveMedOrder(int encounter_id, MedOrder medOrder) {
		return medOrderImpl.saveMedOrder(encounter_id, medOrder);
	}

	public MedOrder getmedOrder(int medorder_id) {
		return medOrderImpl.getmedOrder(medorder_id);
	}

	public MedOrder updateMedOrderById(int medorder_id, MedOrder medOrder) {
		return medOrderImpl.updateMedOrderById(medorder_id, medOrder);
	}

	public List<MedOrder> getAllMedOrder() {
		return medOrderImpl.getAllMedOrder();
	}

	public boolean deleteMedOrder(int medOrder_id) {
		return medOrderImpl.deleteMedOrder(medOrder_id);
	}

}
