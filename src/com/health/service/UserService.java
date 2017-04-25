package com.health.service;

import com.health.pojo.User;

public interface UserService {

	boolean login(String username, String password);

	boolean register(User user);

	boolean changeName(User user);
}
