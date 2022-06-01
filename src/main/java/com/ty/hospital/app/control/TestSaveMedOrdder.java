package com.ty.hospital.app.control;

import com.ty.hospital.app.dao.impl.MedOrderImpl;
import com.ty.hospital.app.dto.MedOrder;
import com.ty.hospital.app.services.impl.MedOrderServiceImpl;

public class TestSaveMedOrdder {

	public static void main(String[] args) {
		
		MedOrder medOrder=new MedOrder();
	
		medOrder.setTotal(0);
		MedOrderServiceImpl medOrderServiceImpl=new MedOrderServiceImpl();
		
		medOrderServiceImpl.saveMedOrder(1, medOrder);
	}
}
