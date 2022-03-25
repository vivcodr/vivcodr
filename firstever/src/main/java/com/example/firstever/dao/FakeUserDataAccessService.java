package com.example.firstever.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.firstever.model.User;

@Repository("fakeDao")
public class FakeUserDataAccessService implements UserDao{

	List<User> userList = new ArrayList<>();
	
	@Override
	public int insertUser(UUID id, User user) {
		userList.add(new User(id, user.getUserName()));
		return 1;
	}

	@Override
	public List<User> selectAllUser() {
		return userList;
	}
	
	@Override
	public User updateUser(User user) {
		Optional<User> oldUser = userList.stream().filter(u -> u.getUUID().equals(user.getUUID())).findFirst();
		oldUser.orElseThrow().setUserName(user.getUserName());
		return user;
	}
}
