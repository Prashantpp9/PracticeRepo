package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.dao.IDeptDao;

public class DeptService implements IDeptDao {

	@Autowired
	private IDeptDao deptDao;
	
	@Override
	public List<String> getDepartmentList() {
		// TODO Auto-generated method stub
		return deptDao.getDepartmentList();
	}

}
