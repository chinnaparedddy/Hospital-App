package com.ty.hospital.app.dao;

import java.util.List;

import com.ty.hospital.app.dto.Encounter;

public interface EncounterDao {

	Encounter saveEncounter(int branch_id,int person_id,Encounter encounter);
	List<Encounter> getAllEncounters();
	Encounter getEncounterById(int encounter_id);
	boolean deleteEncounterByid(int encounter_id);
	Encounter updateEncounterbyId(int encounter_id,Encounter encounter);
}
