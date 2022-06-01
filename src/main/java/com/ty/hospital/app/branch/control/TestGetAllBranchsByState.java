package com.ty.hospital.app.branch.control;

import java.util.List;

import com.ty.hospital.app.dto.Branch;
import com.ty.hospital.app.services.impl.BranchServiceImpl;

public class TestGetAllBranchsByState {

	public static void main(String[] args) {

		BranchServiceImpl branchServiceImpl = new BranchServiceImpl();

		List<Branch> branchs=branchServiceImpl.getBranchByState("Karnataka");
		for (Branch branch : branchs) {
			System.out.println("Branch Id" + branch.getBranch_id());
			System.out.println("Branch Name: " + branch.getBranch_name());
			System.out.println("Branch Phone: " + branch.getPhone());
			System.out.println("Branch Email " + branch.getEmail());

		}
	}

}
