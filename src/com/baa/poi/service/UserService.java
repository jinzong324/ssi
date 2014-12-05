package com.baa.poi.service;

import java.util.List;

import com.baa.poi.entity.User;

public interface UserService {
	
	public void addUser(User user);
	
	public void editUser(User user);
	
	public void savaOrUpdateUser(User user);
	
	public User getUserById(Integer id);
	
	public void delUserById(Integer id);
	
	public List<User> findAllUser();
}
