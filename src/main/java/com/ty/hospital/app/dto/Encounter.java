package com.ty.hospital.app.dto;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Encounter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int encounter_id;
	private LocalDateTime admitDateAndTime;
	private LocalDateTime dischargeDateAndTime;
	private String resion;
	@ManyToOne
	private Person person;
	@ManyToOne
	private Branch branch;
	@OneToMany
	private List<MedOrder> medOrders;
	@OneToMany
	private List<Observation> observations;
	public int getEncounter_id() {
		return encounter_id;
	}
	public void setEncounter_id(int encounter_id) {
		this.encounter_id = encounter_id;
	}
	public LocalDateTime getAdmitDateAndTime() {
		return admitDateAndTime;
	}
	public void setAdmitDateAndTime(LocalDateTime admitDateAndTime) {
		this.admitDateAndTime = admitDateAndTime;
	}
	public LocalDateTime getDischargeDateAndTime() {
		return dischargeDateAndTime;
	}
	public void setDischargeDateAndTime(LocalDateTime dischargeDateAndTime) {
		this.dischargeDateAndTime = dischargeDateAndTime;
	}
	public String getResion() {
		return resion;
	}
	public void setResion(String resion) {
		this.resion = resion;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public List<MedOrder> getMedOrders() {
		return medOrders;
	}
	public void setMedOrders(List<MedOrder> medOrders) {
		this.medOrders = medOrders;
	}
	public List<Observation> getObservations() {
		return observations;
	}
	public void setObservations(List<Observation> observations) {
		this.observations = observations;
	}
	
	

}
