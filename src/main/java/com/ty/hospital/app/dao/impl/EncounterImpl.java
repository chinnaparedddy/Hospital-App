package com.ty.hospital.app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital.app.dao.EncounterDao;
import com.ty.hospital.app.dto.Branch;
import com.ty.hospital.app.dto.Encounter;
import com.ty.hospital.app.dto.Person;

public class EncounterImpl implements EncounterDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Encounter saveEncounter(int branch_id, int person_id, Encounter encounter) {
		Branch branch = entityManager.find(Branch.class, branch_id);
		if (branch != null) {
			Person person = entityManager.find(Person.class, person_id);
			encounter.setBranch(branch);
			encounter.setPerson(person);
			entityTransaction.begin();
			entityManager.persist(encounter);
			entityTransaction.commit();
			return encounter;
		} else {
			return null;
		}
	}

	public List<Encounter> getAllEncounters() {
		String sql = "select e from Encounter e";
		Query query = entityManager.createQuery(sql);
		List<Encounter> encounters = query.getResultList();
		return encounters;
	}

	public Encounter getEncounterById(int encounter_id) {
		Encounter encounter = entityManager.find(Encounter.class, encounter_id);
		return encounter;
	}

	public boolean deleteEncounterByid(int encounter_id) {
		entityTransaction.begin();
		Encounter encounter = entityManager.find(Encounter.class, encounter_id);
		if (encounter != null) {
			entityManager.remove(encounter);
			//entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

	public Encounter updateEncounterbyId(int encounter_id, Encounter encounter) {
		entityTransaction.begin();
		Encounter encounter1 = entityManager.find(Encounter.class, encounter_id);
		encounter1.setAdmitDateAndTime(encounter.getAdmitDateAndTime());
		encounter1.setDischargeDateAndTime(encounter.getDischargeDateAndTime());
		if (encounter1 != null) {
			encounter.setEncounter_id(encounter_id);	
			entityManager.merge(encounter);
			entityTransaction.commit();
			return encounter;
		}
		return null;
	}

}
