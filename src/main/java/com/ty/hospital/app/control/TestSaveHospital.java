package com.ty.hospital.app.control;

import com.ty.hospital.app.dto.Hospital;
import com.ty.hospital.app.services.impl.HospitalserviceImpl;

public class TestSaveHospital {

	public static void main(String[] args) {

		Hospital hospital = new Hospital();
		hospital.setHospital_name("savera");
		hospital.setHospital_gst("9845IND78AP");
		hospital.setHospital_website("www.saveraAtp.com");
		HospitalserviceImpl hospitalserviceImpl = new HospitalserviceImpl();
		Hospital hospital2=hospitalserviceImpl.saveHospital(hospital);
		if(hospital2!=null) {
		System.out.println("Saved");
		}else {
			System.out.println("not saved");
		}
	}
}
