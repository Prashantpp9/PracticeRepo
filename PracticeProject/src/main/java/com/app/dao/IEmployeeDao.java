package com.app.dao;

import com.app.pojos.Employee;

public interface IEmployeeDao {

	Employee authenticateEmployee(String email,String pass);
}
