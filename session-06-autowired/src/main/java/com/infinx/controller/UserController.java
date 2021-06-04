package com.infinx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.infinx.service.UserService;

@Controller
public class UserController {

	UserService userService;



	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}



	public String saveData(String name) {
		String saveUser = userService.saveUser(name);
		return saveUser;
	}

}
