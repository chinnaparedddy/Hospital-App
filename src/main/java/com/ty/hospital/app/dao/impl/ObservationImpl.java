package com.ty.hospital.app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospital.app.dao.ObsevationDao;
import com.ty.hospital.app.dto.Encounter;
import com.ty.hospital.app.dto.Observation;

public class ObservationImpl implements ObsevationDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Observation saveObsevation(int encounter_id, Observation obsevation) {
		entityTransaction.begin();
		Encounter encounter = entityManager.find(Encounter.class, encounter_id);
		if (encounter != null) {
			obsevation.setEncounter(encounter);
			entityManager.persist(obsevation);
			entityTransaction.commit();
			return obsevation;
		} else {
			return null;
		}

	}

	public Observation getObsevationById(int observation_id) {
		Observation observation = entityManager.find(Observation.class, observation_id);
		return observation;
	}

	public boolean deleteObservation(int observation_id) {
		entityTransaction.begin();
		Observation observation = entityManager.find(Observation.class, observation_id);
		if (observation != null) {
			entityManager.remove(observation);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<Observation> getAllObservation(int encounter_id) {
		// TODO Auto-generated method stub
		return null;
	}


}
