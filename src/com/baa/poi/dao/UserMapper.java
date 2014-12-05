package com.baa.poi.dao;

import java.util.List;

import com.baa.poi.dao.supermapper.SuperMapper;
import com.baa.poi.entity.User;

public interface UserMapper extends SuperMapper {

	public int add(User user);
	
	public User get(Integer id);
	
	public int del(Integer id);
	
	public int edit(User user);
	
	public List<User> findAll();
}
