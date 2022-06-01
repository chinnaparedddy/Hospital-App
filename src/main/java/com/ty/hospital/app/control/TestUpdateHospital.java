package com.ty.hospital.app.control;

import com.ty.hospital.app.dto.Hospital;
import com.ty.hospital.app.services.impl.HospitalserviceImpl;

public class TestUpdateHospital {

	public static void main(String[] args) {

		Hospital hospital=new Hospital();
		hospital.setHospital_name("Naresh");
		hospital.setHospital_gst("INDNaresh12451");
		hospital.setHospital_website("www.naresh.com");
		HospitalserviceImpl hospitalserviceImpl=new HospitalserviceImpl();
		Hospital hospital2=hospitalserviceImpl.updateHospitalById(2, hospital);
		if(hospital2!=null) {
		System.out.println("Updated");
		}else {
			System.out.println("not Updated");
		}
	}

}
