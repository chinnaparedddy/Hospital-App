package com.ty.hospital.app.control;

import java.util.ArrayList;
import java.util.List;

import com.ty.hospital.app.dao.impl.BranchImpl;
import com.ty.hospital.app.dto.Branch;
import com.ty.hospital.app.dto.Hospital;
import com.ty.hospital.app.services.impl.BranchServiceImpl;

public class TestSaveBranch {

	public static void main(String[] args) {
		Hospital h=new Hospital();
		BranchServiceImpl branchServiceImpl=new BranchServiceImpl();
		
		Branch branch = new Branch();
		branch.setBranch_name("mahesh");
		branch.setEmail("nareshatp@gmail");
		branch.setPhone(9989452181l);
		List< Branch> branchs=new ArrayList<Branch>();
		branchs.add(branch);
		
		h.setBranchs(branchs);
		
		branchServiceImpl.saveBranch(1, branch);
		System.out.println("added");

	}
}
