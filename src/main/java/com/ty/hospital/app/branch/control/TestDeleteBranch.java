package com.ty.hospital.app.branch.control;

import com.ty.hospital.app.services.impl.BranchServiceImpl;

public class TestDeleteBranch {

	public static void main(String[] args) {

		BranchServiceImpl branchServiceImpl = new BranchServiceImpl();

		boolean flag=branchServiceImpl.branchDeleteById(3);
		if(flag) {
			System.out.println("deleted");
		}else {
			System.out.println("not deleted");
		}
	}

}
