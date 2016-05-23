package com.sysu.moviepro.business.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sysu.moviepro.business.dao.UserDAO;
import com.sysu.moviepro.business.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public int createUser(User user) {
		// TODO Auto-generated method stub
		Integer id = (Integer) sessionFactory.getCurrentSession().save(user);
		return id;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(user);
		return user;
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setId(id);
		sessionFactory.getCurrentSession().delete(user);
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		User user = (User) sessionFactory.getCurrentSession().get(User.class, id);
		return user;
	}
	
	@Override
	public User getUserByName(String name) {
		String hql = "select user.id from User user where user.name = '" + name + "'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List list = query.list();
		assert(list.size() <= 1);
		if (list.isEmpty())
			return new User();
		else {
			int id = (Integer)list.get(0);
			return getUser(id);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery(" From User user ").list();
	}
}
