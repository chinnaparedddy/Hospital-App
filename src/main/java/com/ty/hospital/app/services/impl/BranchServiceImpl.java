package com.ty.hospital.app.services.impl;

import java.util.List;

import com.ty.hospital.app.dao.impl.BranchImpl;
import com.ty.hospital.app.dto.Branch;
import com.ty.hospital.app.services.BranchServices;

public class BranchServiceImpl implements BranchServices {

	BranchImpl branchImpl=new BranchImpl();
	
	public Branch saveBranch(int hospital_id, Branch branch) {
		return branchImpl.saveBranch(hospital_id, branch);
	}

	public Branch getBranchById(int branch_id) {
		return branchImpl.getBranchById(branch_id);
	}

	public boolean branchDeleteById(int branch_id) {
		return branchImpl.branchDeleteById(branch_id);
	}

	public Branch updateBranchById(int branch_id, Branch branch) {
		return branchImpl.updateBranchById(branch_id, branch);
	}

	public List<Branch> getAllBranchsByHospitalId(int hospital_id) {
		return branchImpl.getAllBranchsByHospitalId(hospital_id);
	}

	public List<Branch> getBranchByState(String state) {
		return branchImpl.getBranchByState(state);
	}

}
