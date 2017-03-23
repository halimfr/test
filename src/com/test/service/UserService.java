package com.test.service;

import java.util.List;

import com.test.model.User;

public interface UserService {
	
	public void save (User user);
	
	public List<User> findAllUser();

}
