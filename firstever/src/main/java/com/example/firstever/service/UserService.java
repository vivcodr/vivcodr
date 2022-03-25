package com.example.firstever.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.firstever.dao.UserDao;
import com.example.firstever.model.User;

@Service
public class UserService {

	public UserDao userDao;
	
	@Autowired
	private UserService(@Qualifier("fakeDao") UserDao userDao) {
		this.userDao = userDao;
	}

	public int addUser(User user) {
		return userDao.insertUser(user);
	}
	
	public List<User> getAllUser(){
		return userDao.selectAllUser();
	}
	
	public User updateUser(User user) {
		return userDao.updateUser(user);
	}
}
