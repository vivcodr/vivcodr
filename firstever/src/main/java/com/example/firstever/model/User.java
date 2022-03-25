package com.example.firstever.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
	
	private final UUID id;
	private String userName;
	
	public User(@JsonProperty("uuid")UUID id, @JsonProperty("name") String userName) {
		this.id = id;
		this.userName = userName;
	}
	
	public UUID getUUID() {
		return id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
