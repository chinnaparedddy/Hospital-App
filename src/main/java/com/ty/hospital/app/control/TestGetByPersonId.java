package com.ty.hospital.app.control;

import com.ty.hospital.app.dto.Person;
import com.ty.hospital.app.services.impl.PersonServiceImpl;

public class TestGetByPersonId {

	public static void main(String[] args) {

		PersonServiceImpl personServiceImpl=new PersonServiceImpl();
		Person person=personServiceImpl.getPersonById(1);
		if(person!=null) {
			System.out.println(person.getPerson_id());
			System.out.println(person.getPerson_name());
			System.out.println(person.getPerson_email());
			System.out.println(person.getPerson_phone());
			System.out.println("*****************************");
		}
	}

}
