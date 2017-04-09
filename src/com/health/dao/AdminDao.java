package com.health.dao;

import java.util.List;

import com.health.pojo.Admin;

public interface AdminDao {
	Admin get(Integer id);

	Integer save(Admin admin);

	void update(Admin admin);

	void delete(Admin admin);

	void delete(Integer id);

	List<Admin> findAll();

	List<Admin> findByNameAndPass(String admin, String adpwd);

	Admin findByName(String admin);

	boolean adminlogin(String admin, String adpwd);
}
