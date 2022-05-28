package com.ty.hospital.app.dao;

import com.ty.hospital.app.dto.Hospital;

public interface HospitalDao {

	Hospital saveHospital(Hospital hospital);
	Hospital getHospitalById(int hospital_id);
	Hospital updateHospitalById(int hospital_id,Hospital hospital);
	boolean deleteHospitalById(int hospital_id);
}
