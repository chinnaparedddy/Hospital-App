package com.ty.hospital.app.control;

import com.ty.hospital.app.dto.Person;
import com.ty.hospital.app.services.impl.PersonServiceImpl;

public class TestDeleteByPersonId {

	public static void main(String[] args) {

		PersonServiceImpl personServiceImpl=new PersonServiceImpl();
		 Person person=personServiceImpl.deletePesonById(1);
		 System.out.println("deleted");
		
	}

}
