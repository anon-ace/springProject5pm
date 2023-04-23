package com.jj.springProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jj.springProject.model.User;
import com.jj.springProject.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping({"/","/login"})
	public String getLogin() {
		
		return "LoginForm";
	}
	
	@PostMapping("/login")
	public String doLogin(@ModelAttribute User user) {
		
		User usr = service.userLogin(user.getUsername(), user.getPassword());
		
		if (usr != null) {
			
			return "Home";
		}

		return "LoginForm";
	}
	
	@GetMapping("/signup")
	public String getSignUp() {
		
		return "SignUpForm";
	}
	
	@PostMapping("/signup")
	public String postSignUp(@ModelAttribute User user) {
		
		service.userSignup(user);
		
		return "LoginForm";
		
	}
}
