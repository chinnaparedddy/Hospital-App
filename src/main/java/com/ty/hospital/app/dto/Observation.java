package com.ty.hospital.app.dto;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Observation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int observation_id;
	private LocalDateTime date_time;
	private String status;
	private String remarks;
	
	@ManyToOne
	@JoinColumn
	private Encounter encounter;
	
	
	public Encounter getEncounter() {
		return encounter;
	}
	public void setEncounter(Encounter encounter) {
		this.encounter = encounter;
	}
	public int getObservation_id() {
		return observation_id;
	}
	public void setObservation_id(int observation_id) {
		this.observation_id = observation_id;
	}
	
	public LocalDateTime getDate_time() {
		return date_time;
	}
	public void setDate_time(LocalDateTime date_time) {
		this.date_time = date_time;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
	
}
