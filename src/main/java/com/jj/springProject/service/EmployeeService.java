package com.jj.springProject.service;

import java.util.List;

import com.jj.springProject.model.Employee;

public interface EmployeeService {
	
	void addEmp(Employee employee);
	void deleteEmp(long id);
	void update(Employee employee);
	Employee getEmpById(long id);
	List<Employee> getAllEmps();

}
