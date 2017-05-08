package com.health.service;

import java.util.List;

import com.health.pojo.User;

public interface UserService {

	boolean login(String username, String password);

	boolean register(User user);

	boolean changeName(User user);
	List<User> findByName(String username);
}
