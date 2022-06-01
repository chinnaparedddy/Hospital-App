package com.ty.hospital.app.control;

import java.util.ArrayList;
import java.util.List;

import com.ty.hospital.app.dao.impl.PersonImpl;
import com.ty.hospital.app.dto.Encounter;
import com.ty.hospital.app.dto.Person;
import com.ty.hospital.app.services.impl.PersonServiceImpl;

public class TestSavePerson {

	public static void main(String[] args) {

		Person person = new Person();
		person.setPerson_name("Karthik");
		person.setPerson_email("kathi@gmail.com");
		person.setPerson_phone(894561237l);
		List<Encounter> encounters = new ArrayList<Encounter>();
		person.setEncounter(encounters);
		
		PersonServiceImpl personServiceImpl = new PersonServiceImpl();
		personServiceImpl.savePerson(person);
	}

}
