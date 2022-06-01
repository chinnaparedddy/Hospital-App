package com.ty.hospital.app.branch.obsevation.control;

import com.ty.hospital.app.dto.Observation;
import com.ty.hospital.app.services.impl.ObservationServiceImpl;

public class TestGetObservationById {

	public static void main(String[] args) {
		
		ObservationServiceImpl observationServiceImpl=new ObservationServiceImpl();
		Observation observation=observationServiceImpl.getObsevationById(1);
		if(observation!=null) {
			System.out.println(observation.getObservation_id());
			System.out.println(observation.getRemarks());
			System.out.println(observation.getStatus());
			System.out.println(observation.getDate_time());
		}
		
	}

}
