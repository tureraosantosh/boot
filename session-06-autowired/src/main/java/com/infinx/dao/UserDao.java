package com.infinx.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	public String saveData(String name)
	{
		return "Data Saved Successfully "+name;
	}

}
