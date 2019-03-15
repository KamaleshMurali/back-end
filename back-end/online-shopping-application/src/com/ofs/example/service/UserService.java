package com.ofs.example.service;

import com.ofs.example.model.User;

public interface UserService {
	
	public void addUser(User user);
	public User getUser(long id);
}
