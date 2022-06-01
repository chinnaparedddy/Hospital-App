package com.ty.hospital.app.services.impl;

import java.util.List;

import com.ty.hospital.app.dao.impl.PersonImpl;
import com.ty.hospital.app.dto.Person;
import com.ty.hospital.app.services.PersonService;

public class PersonServiceImpl implements  PersonService {

	PersonImpl personImpl=new PersonImpl();

	public Person savePerson(Person person) {
		return personImpl.savePerson(person);
	}

	public Person getPersonById(int person_Id) {
		return personImpl.getPersonById(person_Id);
	}

	public List<Person> getAllPersons() {
		return personImpl.getAllPersons();
	}

	public Person deletePesonById(int Person_id) {
		return personImpl.deletePesonById(Person_id);
	}
	
}
