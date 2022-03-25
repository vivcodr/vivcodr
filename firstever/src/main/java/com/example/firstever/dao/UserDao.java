package com.example.firstever.dao;

import java.util.List;
import java.util.UUID;

import com.example.firstever.model.User;

public interface UserDao {
	
	int insertUser(UUID id, User user);

	default int insertUser(User user) {
		UUID id = UUID.randomUUID();
		return insertUser(id, user);
	}
	
	List<User> selectAllUser();
	
	default User updateUser(User user) {
		return updateUser(user);
	}

}
