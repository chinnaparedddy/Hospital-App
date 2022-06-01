package com.ty.hospital.app.services.impl;

import com.ty.hospital.app.dao.HospitalDao;
import com.ty.hospital.app.dao.impl.Hospitalimpl;
import com.ty.hospital.app.dto.Hospital;
import com.ty.hospital.app.services.HospitalService;

public class HospitalserviceImpl implements HospitalService {

	HospitalDao hospitalDao=new Hospitalimpl();
	public Hospital saveHospital(Hospital hospital) {
		return hospitalDao.saveHospital(hospital);
	}

	public Hospital getHospitalById(int hospital_id) {
		return hospitalDao.getHospitalById(hospital_id);
	}

	public Hospital updateHospitalById(int hospital_id, Hospital hospital) {
		return hospitalDao.updateHospitalById(hospital_id, hospital);
	}

	public boolean deleteHospitalById(int hospital_id) {
		return hospitalDao.deleteHospitalById(hospital_id);
	}

}
