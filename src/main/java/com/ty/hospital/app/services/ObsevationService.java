package com.ty.hospital.app.services;

import java.util.List;

import com.ty.hospital.app.dto.Observation;

public interface ObsevationService {


	Observation saveObsevation(int encounter_id,Observation obsevation);
	Observation getObsevationById(int observation_id);
	boolean deleteObservation(int observation_id);
	List< Observation> getAllObservation(int encounter_id);
}
