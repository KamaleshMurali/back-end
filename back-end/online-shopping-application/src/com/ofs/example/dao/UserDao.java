package com.ofs.example.dao;

import com.ofs.example.model.User;

public interface UserDao {

	public void addUser(User user);
	public User getUser(long id);
}
