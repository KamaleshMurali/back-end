package com.ofs.example.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ofs.example.dao.UserDao;
import com.ofs.example.model.User;

@Service
public class UserServiceImp implements UserService{
	
	@Autowired
	private UserDao userDao;

	@Override
	@Transactional
	public void addUser(User user) {
		// TODO Auto-generated method stub
		this.userDao.addUser(user);
		
	}

	@Override
	@Transactional
	public User getUser(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
