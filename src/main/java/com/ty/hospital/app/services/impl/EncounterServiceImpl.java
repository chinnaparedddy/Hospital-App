package com.ty.hospital.app.services.impl;

import java.util.List;

import com.ty.hospital.app.dao.EncounterDao;
import com.ty.hospital.app.dao.impl.EncounterImpl;
import com.ty.hospital.app.dto.Encounter;
import com.ty.hospital.app.services.EncounterService;

public class EncounterServiceImpl implements EncounterService{


	EncounterDao encounterImpl=new EncounterImpl();
			

	public Encounter saveEncounter(int branch_id, int person_id, Encounter encounter) {
		return encounterImpl.saveEncounter(branch_id, person_id, encounter);
	}

	public List<Encounter> getAllEncounters() {
		return encounterImpl.getAllEncounters();
	}

	public Encounter getEncounterById(int encounter_id) {
		return encounterImpl.getEncounterById(encounter_id);
	}

	public boolean deleteEncounterByid(int encounter_id) {
		return encounterImpl.deleteEncounterByid(encounter_id);
	}

	public Encounter updateEncounterbyId(int encounter_id, Encounter encounter) {
		return encounterImpl.updateEncounterbyId(encounter_id, encounter);
	}
	
}
