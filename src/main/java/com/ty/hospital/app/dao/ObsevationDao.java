package com.ty.hospital.app.dao;
import com.ty.hospital.app.dto.*;
import java.util.List;

public interface ObsevationDao {

	Observation saveObsevation(int encounter_id,Observation obsevation);
	Observation getObsevationById(int observation_id);
	boolean deleteObservation(int observation_id);
	List< Observation> getAllObservation(int encounter_id);
}
