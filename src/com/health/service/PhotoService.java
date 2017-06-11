package com.health.service;

import java.util.List;

import com.health.pojo.News;
import com.health.pojo.Photo;

public interface PhotoService {
	public List<Photo> findByNew(News news);
	public List<Photo> findCheckByNew(News news);
	public Integer save(Photo photo);
	public void update(Photo photo);
	public void delete(Photo photo);
	public List<Photo> findById(Integer id);
}
