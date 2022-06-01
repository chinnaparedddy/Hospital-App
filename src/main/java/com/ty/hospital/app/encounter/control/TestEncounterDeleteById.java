package com.ty.hospital.app.encounter.control;

import com.ty.hospital.app.services.impl.EncounterServiceImpl;

public class TestEncounterDeleteById {

	public static void main(String[] args) {

		EncounterServiceImpl encounterServiceImpl = new EncounterServiceImpl();
		if(encounterServiceImpl.deleteEncounterByid(1)) {
			System.out.println("Deleted");
		}else {
			System.out.println("Not Deleteed");
		}
	}

}
