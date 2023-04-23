package com.jj.springProject.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jj.springProject.model.Department;
import com.jj.springProject.repository.DepartmentRepository;
import com.jj.springProject.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private DepartmentRepository dptrepo;
	
	@Override
	public void addDepartment(Department dept) {
		
		dptrepo.save(dept);
	}

}
