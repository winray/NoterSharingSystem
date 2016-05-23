package com.sysu.moviepro.business.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sysu.moviepro.business.dao.UserDAO;
import com.sysu.moviepro.business.entity.User;
import com.sysu.moviepro.business.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	public UserServiceImpl() {
		System.out.println("UserServiceImpl()");
	}

	@Autowired
	private UserDAO userDAO;

	@Override
	public int createUser(User user) {
		// TODO Auto-generated method stub
		return userDAO.createUser(user);
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return userDAO.updateUser(user);
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		userDAO.deleteUser(id);
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return userDAO.getUser(id);
	}
	
	@Override
	public User getUserByName(String name) {
		return userDAO.getUserByName(name);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userDAO.getAllUsers();
	}
}
