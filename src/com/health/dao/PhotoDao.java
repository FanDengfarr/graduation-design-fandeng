package com.health.dao;

import java.util.List;

import com.health.pojo.Photo;

public interface PhotoDao {
	Photo get(Integer id);

	Integer save(Photo photo);

	void update(Photo photo);

	void delete(Photo photo);

	void delete(Integer id);

	List<Photo> findAll();

	Photo findByName(String name);
}
