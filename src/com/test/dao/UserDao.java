package com.test.dao;

import java.util.List;

import com.test.model.User;

public interface UserDao {

	public List<User> findAllUsers();
	
}
