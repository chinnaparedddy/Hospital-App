package com.ty.hospital.app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital.app.dao.PersonDao;
import com.ty.hospital.app.dto.Person;

public class PersonImpl implements  PersonDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	

	public Person savePerson(Person person) {
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
		return person;
	}

	public Person getPersonById(int person_Id) {
		Person person=entityManager.find(Person.class, person_Id);
		return person;
	}

	public List<Person> getAllPersons() {
		String sql="select p from Person p";
		Query query=entityManager.createQuery(sql);
		List<Person>persons=query.getResultList();
		
		return persons;
	}

	public Person deletePesonById(int Person_id) {
		Person person=entityManager.find(Person.class, Person_id);

		return person;
	}

}
