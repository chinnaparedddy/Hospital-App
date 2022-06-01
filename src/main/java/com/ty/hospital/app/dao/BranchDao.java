package com.ty.hospital.app.dao;

import java.util.List;

import com.ty.hospital.app.dto.Branch;

public interface BranchDao {

	Branch saveBranch(int hospital_id,Branch branch);
	Branch getBranchById(int branch_id);
	boolean branchDeleteById(int branch_id);
	Branch updateBranchById(int branch_id,Branch branch);
	List<Branch> getAllBranchsByHospitalId(int hospital_id);
	List<Branch> getBranchByState(String state);
	
}
