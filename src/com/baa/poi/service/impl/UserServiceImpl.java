package com.baa.poi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baa.poi.dao.UserMapper;
import com.baa.poi.entity.User;
import com.baa.poi.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	public void addUser(User user) {
		userMapper.add(user);
	}

	public void delUserById(Integer id) {
		userMapper.del(id);
	}

	public void editUser(User user) {
		userMapper.edit(user);
	}

	public List<User> findAllUser() {
		return userMapper.findAll();
	}

	public User getUserById(Integer id) {
		return userMapper.get(id);
	}

	public void savaOrUpdateUser(User user) {
		if(null != user.getId() && user.getId() != 0){
			editUser(user);
		}else{
			addUser(user);
		}
	}

}
