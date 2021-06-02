package com.infinx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infinx.dao.UserDao;

@Service
public class UserService {

	UserDao userDao;

	@Autowired
	public UserService(UserDao dao) {

		this.userDao = dao;
	}

	public String saveUser(String name) {

		String saveData = userDao.saveData(name);

		return saveData;
	}

}
