package com.app.service;

import com.app.pojos.Employee;

public interface IEmployeeService {

	Employee authenticateEmployee(String email, String pass);
}
