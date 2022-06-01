package com.ty.hospital.app.branch.control;

import com.ty.hospital.app.dto.Branch;
import com.ty.hospital.app.services.impl.BranchServiceImpl;

public class TestUpdateBranchByid {

	public static void main(String[] args) {

		Branch branch=new Branch();
		branch.setBranch_name("sukesh");
		branch.setEmail("suki@gmail.com");
		branch.setPhone(9865322154l);
		BranchServiceImpl branchServiceImpl=new BranchServiceImpl();
		branchServiceImpl.updateBranchById(1, branch);

	}

}
