package com.sysu.moviepro.business.dao;

import com.sysu.moviepro.business.entity.User;

import java.util.List;

public interface UserDAO {
	public int createUser(User user);
	public User updateUser(User user);
	public void deleteUser(int id);
	public User getUser(int id);
	public User getUserByName(String name);
	public List<User> getAllUsers();
}