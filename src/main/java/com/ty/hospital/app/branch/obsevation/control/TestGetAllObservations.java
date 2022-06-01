package com.ty.hospital.app.branch.obsevation.control;

import java.util.List;

import com.ty.hospital.app.dto.Observation;
import com.ty.hospital.app.services.impl.ObservationServiceImpl;

public class TestGetAllObservations {

	public static void main(String[] args) {

		ObservationServiceImpl observationServiceImpl=new ObservationServiceImpl();
		List<Observation> observations=observationServiceImpl.getAllObservation(1);
		
		for(Observation observation:observations) {
			
			System.out.println(observation.getObservation_id());
			System.out.println(observation.getRemarks());
			System.out.println(observation.getStatus());
			System.out.println(observation.getDate_time());
			System.out.println("****************************");
		}
	}

}
