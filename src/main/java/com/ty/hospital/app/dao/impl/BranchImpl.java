package com.ty.hospital.app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital.app.dao.BranchDao;
import com.ty.hospital.app.dto.Branch;
import com.ty.hospital.app.dto.Hospital;

public class BranchImpl implements BranchDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Branch saveBranch(int hospital_id, Branch branch) {
		entityTransaction.begin();
		Hospital hospital = entityManager.find(Hospital.class, hospital_id);
		branch.setHospital(hospital);
		entityManager.persist(branch);
		entityTransaction.commit();
		return branch;
	}

	public Branch getBranchById(int branch_id) {
		Branch branch = entityManager.find(Branch.class, branch_id);

		return branch;
	}

	public boolean branchDeleteById(int branch_id) {
		entityTransaction.begin();
		Branch branch = entityManager.find(Branch.class, branch_id);
		if (branch != null) {
			entityManager.remove(branch);
			//entityTransaction.commit();
			return true;
		}
		return false;
	}

	public Branch updateBranchById(int branch_id, Branch branch) {
		entityTransaction.begin();
		Branch branch1 = entityManager.find(Branch.class, branch_id);
		if (branch1 != null) {
			branch.setBranch_id(branch_id);
			entityManager.merge(branch);
			entityTransaction.commit();
			return branch;
		}
		return null;
	}

	public List<Branch> getBranchByState(String state) {
		String sql = "select b from Branch b where b.address.state=?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, state);
		List<Branch> branchs = query.getResultList();

		return branchs;
	}

	public List<Branch> getAllBranchsByHospitalId(int hospital_id) {
		Hospital hospital = entityManager.find(Hospital.class, hospital_id);
		if (hospital != null) {
			List<Branch> branchs = hospital.getBranchs();
			return branchs;
		} else {
			return null;
		}
	}

}
