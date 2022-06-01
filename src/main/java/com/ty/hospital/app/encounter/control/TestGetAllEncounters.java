package com.ty.hospital.app.encounter.control;

import java.util.List;

import com.ty.hospital.app.dto.Encounter;
import com.ty.hospital.app.services.impl.EncounterServiceImpl;

public class TestGetAllEncounters {

	public static void main(String[] args) {
		EncounterServiceImpl encounterServiceImpl = new EncounterServiceImpl();
		List<Encounter> encounters = encounterServiceImpl.getAllEncounters();
		for (Encounter encounter : encounters) {
			System.out.println(encounter.getEncounter_id());
			System.out.println(encounter.getAdmitDateAndTime());
			System.out.println(encounter.getDischargeDateAndTime());
			System.out.println(encounter.getResion());
			System.out.println("*************************");

		}
	}

}
