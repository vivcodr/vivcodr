package com.example.firstever.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstever.model.User;
import com.example.firstever.service.UserService;

@RequestMapping("api/v1/user")
@RestController
public class UserController {
	
	private final UserService userService;

	@Autowired
	private UserController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}
	
	@GetMapping
	public List<User> getAllUser(){
		return userService.getAllUser();
	}
	
	@PutMapping
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}

}
