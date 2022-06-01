package com.ty.hospital.app.dao;

import java.util.List;

import com.ty.hospital.app.dto.Person;

public interface PersonDao {

	Person savePerson(Person person);
	Person getPersonById(int person_Id);
	List<Person> getAllPersons();
	Person deletePesonById(int Person_id);
}
