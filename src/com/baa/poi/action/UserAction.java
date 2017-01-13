package com.baa.poi.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.baa.poi.entity.User;
import com.baa.poi.service.UserService;

public class UserAction {
	@Autowired
	private UserService userService;
	
	private String forward;
	
	private User user;
	private List<User> users;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public String getForward() {
		return forward;
	}
	public void setForward(String forward) {
		this.forward = forward;
	}
	

	public String search(){
		users = userService.findAllUser();
		forward = "/index.jsp";
		return "forwardjsp";
	}
	
	public String toEdit(){
		user = userService.getUserById(user.getId());
		forward = "/modify.jsp";
		return "forwardjsp";
	}
	
	public String toAdd(){
		forward = "/modify.jsp";
		return "forwardjsp";
	}
	
	public String save(){
		userService.savaOrUpdateUser(user);
		forward = "/user/user_search";
		return "redirectjsp";
	}
}
