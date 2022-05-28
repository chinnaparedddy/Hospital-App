package com.ty.hospital.app.dao;

import java.util.List;

public interface Obsevation {

	Obsevation saveObsevation(int encounter_id,Obsevation obsevation);
	Obsevation getObsevationById(int observation_id);
	boolean deleteObservation(int observation_id);
	List< Obsevation> getAllObservation(int encounter_id);
}
