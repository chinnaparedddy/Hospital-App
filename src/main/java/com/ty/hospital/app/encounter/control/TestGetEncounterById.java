package com.ty.hospital.app.encounter.control;

import com.ty.hospital.app.dto.Encounter;
import com.ty.hospital.app.services.impl.EncounterServiceImpl;

public class TestGetEncounterById {

	public static void main(String[] args) {

		EncounterServiceImpl encounterServiceImpl=new EncounterServiceImpl();
		Encounter encounter=encounterServiceImpl.getEncounterById(1);
		if(encounter!=null) {
			System.out.println(encounter.getEncounter_id());
			System.out.println(encounter.getAdmitDateAndTime());
			System.out.println(encounter.getDischargeDateAndTime());
			System.out.println(encounter.getResion());
		}
	}

}
