package com.ty.hospital.app.control;

import com.ty.hospital.app.dto.Hospital;
import com.ty.hospital.app.services.impl.HospitalserviceImpl;

public class TestGetByIdHospital {

	public static void main(String[] args) {

	HospitalserviceImpl hospitalserviceImpl = new HospitalserviceImpl();
	    Hospital hospital=hospitalserviceImpl.getHospitalById(2);

	    if(hospital!=null) {
	    System.out.println(hospital.getHospital_id());
	    System.out.println(hospital.getHospital_name());
	    System.out.println(hospital.getHospital_gst());
	    System.out.println(hospital.getHospital_website());
	    }else {
	    	System.out.println("No data found on Id");
	    }
	}

}
