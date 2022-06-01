package com.ty.hospital.app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital.app.dao.UserDao;
import com.ty.hospital.app.dto.Branch;
import com.ty.hospital.app.dto.User;

public class UserImpl implements UserDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public User saveUser(int branch_id, User user) {
		entityTransaction.begin();
		Branch branch = entityManager.find(Branch.class, branch_id);
		user.setBranch(branch);
		entityManager.persist(user);
		entityTransaction.commit();
		return user;
	}

	public User updateUser(int user_id, User user) {
		entityTransaction.begin();
		User user1 = entityManager.find(User.class, user_id);
		if (user1 != null) {
			user.setUser_id(user_id);
			entityManager.merge(user);
			entityTransaction.commit();
			return user;
		} else {
			return null;
		}
	}

	public boolean deleteUser(int user_id) {
		entityTransaction.begin();
		User user = entityManager.find(User.class, user_id);
		if (user != null) {
			entityManager.remove(user);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

	public User getUserById(int user_id) {
		User user = entityManager.find(User.class, user_id);

		return user;
	}

	public List<User> getUserByRole(String user_role) {
		String sql = "select u from User u where u.user_role=?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, user_role);
		List<User> users = query.getResultList();
		return users;
	}

	public User validateUser(String user_email, String user_password) {
		String sql = "select u from User u where u.user_email=?1 and u.user_password=?2";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, user_email);
		query.setParameter(2, user_password);
		Object user = query.getSingleResult();
		return (User) user;
	}

	public List<User> getAllUsers() {
		String sql = "select u from User u";
		Query query = entityManager.createQuery(sql);
		query.getResultList();
		return null;
	}
}