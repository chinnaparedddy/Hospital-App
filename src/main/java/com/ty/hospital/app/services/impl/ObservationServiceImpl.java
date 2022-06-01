package com.ty.hospital.app.services.impl;

import java.util.List;

import com.ty.hospital.app.dao.impl.ObservationImpl;
import com.ty.hospital.app.dto.Observation;
import com.ty.hospital.app.services.ObsevationService;

public class ObservationServiceImpl  implements ObsevationService{

	ObservationImpl observationImpl=new ObservationImpl();
	public Observation saveObsevation(int encounter_id, Observation obsevation) {
		return observationImpl.saveObsevation(encounter_id, obsevation);
	}

	public Observation getObsevationById(int observation_id) {
		return observationImpl.getObsevationById(observation_id);
	}

	public boolean deleteObservation(int observation_id) {
		return observationImpl.deleteObservation(observation_id);
	}

	public List<Observation> getAllObservation(int encounter_id) {
		return observationImpl.getAllObservation(encounter_id);
	}

}
