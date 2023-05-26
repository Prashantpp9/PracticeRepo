package com.app.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.app.pojos.Employee;

public class EmployeeDaoImpl implements IEmployeeDao {

	@Autowired
	private SessionFactory sf;

	@Override
	public Employee authenticateEmployee(String email, String pass) {
		String jpql = "select e from Employee e where e.email=:em and e.password=:pass";
		return sf.getCurrentSession().createQuery(jpql, Employee.class).setParameter("em", email)
				.setParameter("pass", pass).getSingleResult();
	}

}
