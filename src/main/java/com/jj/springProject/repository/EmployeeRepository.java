package com.jj.springProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jj.springProject.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
