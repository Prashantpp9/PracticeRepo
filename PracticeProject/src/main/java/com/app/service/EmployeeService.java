package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.dao.IEmployeeDao;
import com.app.pojos.Employee;

public class EmployeeService implements IEmployeeService {

	@Autowired
	private IEmployeeDao employeeDao;
	
	@Override
	public Employee authenticateEmployee(String email, String pass) {
		// TODO Auto-generated method stub
		return employeeDao.authenticateEmployee(email, pass);
	}

}
