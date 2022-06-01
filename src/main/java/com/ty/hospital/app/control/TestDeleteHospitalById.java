package com.ty.hospital.app.control;

import com.ty.hospital.app.services.impl.HospitalserviceImpl;

public class TestDeleteHospitalById {

	public static void main(String[] args) {

		HospitalserviceImpl hospitalserviceImpl=new HospitalserviceImpl();
		if(hospitalserviceImpl.deleteHospitalById(1)) {
			System.out.println("Deleted");
		}else {
			System.out.println("not Deleted");
		}
		
	}

}
