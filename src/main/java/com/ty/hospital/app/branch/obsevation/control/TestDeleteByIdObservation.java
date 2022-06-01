package com.ty.hospital.app.branch.obsevation.control;

import com.ty.hospital.app.dto.Observation;
import com.ty.hospital.app.services.impl.ObservationServiceImpl;

public class TestDeleteByIdObservation {
public static void main(String[] args) {
	

	ObservationServiceImpl observationServiceImpl=new ObservationServiceImpl();
	boolean flag=observationServiceImpl.deleteObservation(1);
	if(flag) {
		System.out.println("Deleted");
	}else {
		System.out.println("Not deleted");
	}
	
}
}
