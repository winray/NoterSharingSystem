package com.sysu.moviepro.business.service;

import java.util.List;

import com.sysu.moviepro.business.entity.User;

public interface UserService {
	public int createUser(User user);
	public User updateUser(User user);
	public void deleteUser(int id);
	public User getUser(int id);
	public User getUserByName(String name);
	public List<User> getAllUsers(); 
}
