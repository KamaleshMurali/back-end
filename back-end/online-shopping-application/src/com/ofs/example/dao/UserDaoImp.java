package com.ofs.example.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ofs.example.model.User;

@Repository
public class UserDaoImp implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(user);
	}

	@Override
	public User getUser(long id) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		User user = session.load(User.class, new Long(id));
		return user;
	}

}
