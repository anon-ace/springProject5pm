package com.jj.springProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jj.springProject.model.Employee;
import com.jj.springProject.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	@GetMapping("/employee")
	public String getEmployee() {

		return "AddEmployee";
	}

	@PostMapping("/employee")
	public String addEmployee(@ModelAttribute Employee employee) {
		
		empService.addEmp(employee);
		
		return "AddEmployee";

	}

}
