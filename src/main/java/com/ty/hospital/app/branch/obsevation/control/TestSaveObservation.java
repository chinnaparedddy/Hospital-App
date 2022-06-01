package com.ty.hospital.app.branch.obsevation.control;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.ty.hospital.app.dao.impl.ObservationImpl;
import com.ty.hospital.app.dto.Encounter;
import com.ty.hospital.app.dto.Observation;
import com.ty.hospital.app.services.impl.ObservationServiceImpl;

public class TestSaveObservation {

	public static void main(String[] args) {

		Encounter encounter=new Encounter();
		Observation observation=new Observation();
		observation.setStatus("Normal stage");
		observation.setRemarks("saty 2more days");
		observation.setDate_time(LocalDateTime.now());
		ObservationServiceImpl observationServiceImpl=new ObservationServiceImpl();
		observationServiceImpl.saveObsevation(1, observation);

	}

}
