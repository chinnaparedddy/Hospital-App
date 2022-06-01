package com.ty.hospital.app.encounter.control;

import java.time.LocalDateTime;

import com.ty.hospital.app.dao.impl.EncounterImpl;
import com.ty.hospital.app.dto.Encounter;
import com.ty.hospital.app.services.impl.EncounterServiceImpl;

public class TestSaveEncounter {

	public static void main(String[] args) {

		Encounter encounter=new Encounter();
		encounter.setAdmitDateAndTime(LocalDateTime.now());
		encounter.setDischargeDateAndTime(LocalDateTime.now());
		encounter.setResion("LungCancer");
		EncounterServiceImpl encounterImpl=new EncounterServiceImpl();
		Encounter encounter2=encounterImpl.saveEncounter(1,1, encounter);
		if(encounter2!=null) {
			System.out.println("Saved");
		}else {
			System.out.println("not saved");
		}
	}

}
