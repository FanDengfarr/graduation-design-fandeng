package com.health.dao;

import java.util.List;

import com.health.pojo.User;

public interface UserDao {
	User get(Integer id);

	Integer save(User user);

	void update(User user);

	void delete(User user);

	void delete(Integer id);

	List<User> findAll();

	List<User> findByNameAndPass(String name, String pass);
	List<User> findById(Integer id);

	List<User> findByName(String username);

	boolean login(String username, String password);
	boolean checkName(String name);
	boolean checkPass(String password);

}
