package com.app.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class DeptDaoImpl implements IDeptDao {

	@Autowired
	private SessionFactory sf;
	
	@Override
	public List<String> getDepartmentList() {
		String jpql = "select d from Department d";
		return sf.getCurrentSession(). createQuery(jpql, String.class).getResultList();
	}

}
