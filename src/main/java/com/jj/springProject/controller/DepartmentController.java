package com.jj.springProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jj.springProject.model.Department;
import com.jj.springProject.service.DepartmentService;

@Controller
public class DepartmentController {
	
	@Autowired
	private DepartmentService ds;
	
	@GetMapping("/department")
	public String getDept() {
		return "AddDepartment";
		
	}
	
	@PostMapping("/department")
	public String postDept(@ModelAttribute Department dept) {
		
		ds.addDepartment(dept);
		return "Home";
		
	}
}
