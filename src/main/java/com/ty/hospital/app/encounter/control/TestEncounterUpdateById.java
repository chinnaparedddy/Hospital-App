package com.ty.hospital.app.encounter.control;

import java.time.LocalDateTime;

import com.ty.hospital.app.dto.Encounter;
import com.ty.hospital.app.services.impl.EncounterServiceImpl;

public class TestEncounterUpdateById {

	public static void main(String[] args) {

		EncounterServiceImpl encounterServiceImpl = new EncounterServiceImpl();
		Encounter encounter=new Encounter();
		encounter.setDischargeDateAndTime(LocalDateTime.now());
		encounter.setAdmitDateAndTime(LocalDateTime.now());
		encounter.setResion("cancer");
		encounterServiceImpl.updateEncounterbyId(3, encounter);
	}

}
