package com.jj.springProject.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jj.springProject.model.User;
import com.jj.springProject.repository.UserRepository;
import com.jj.springProject.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public void userSignup(User user) {
		userRepo.save(user);
		
	}

	@Override
	public User userLogin(String un, String psw) {
	
		return userRepo.findByUsernameAndPassword(un, psw);
	}

}
