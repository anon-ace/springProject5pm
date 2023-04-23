package com.jj.springProject.service;

import com.jj.springProject.model.User;

public interface UserService {
	
	void userSignup(User user);
	
	User userLogin(String un, String psw);

}
