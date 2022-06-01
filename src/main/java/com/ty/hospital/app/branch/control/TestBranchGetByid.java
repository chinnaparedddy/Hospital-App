package com.ty.hospital.app.branch.control;

import com.ty.hospital.app.dto.Branch;
import com.ty.hospital.app.services.impl.BranchServiceImpl;

public class TestBranchGetByid {

	public static void main(String[] args) {

		BranchServiceImpl branchServiceImpl=new BranchServiceImpl();
		Branch branch=branchServiceImpl.getBranchById(1);
		if(branch!=null) {
			System.out.println("Branch Id"+branch.getBranch_id());
			System.out.println("Branch Name: "+branch.getBranch_name());
			System.out.println("Branch Phone: "+branch.getPhone());
			System.out.println("Branch Email "+branch.getEmail());
		}
	}

}
