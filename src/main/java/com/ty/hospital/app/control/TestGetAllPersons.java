package com.ty.hospital.app.control;

import java.util.List;

import com.ty.hospital.app.dto.Person;
import com.ty.hospital.app.services.impl.PersonServiceImpl;

public class TestGetAllPersons {

	public static void main(String[] args) {
		PersonServiceImpl personServiceImpl = new PersonServiceImpl();
		List<Person> persons = personServiceImpl.getAllPersons();
		for (Person person : persons) {
			System.out.println(person.getPerson_id());
			System.out.println(person.getPerson_name());
			System.out.println(person.getPerson_email());
			System.out.println(person.getPerson_phone());
			System.out.println("*****************************");
		}
	}
}
