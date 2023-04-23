package com.jj.springProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jj.springProject.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
	
}
