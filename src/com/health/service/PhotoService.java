package com.health.service;

import java.util.List;

import com.health.pojo.News;
import com.health.pojo.Photo;

public interface PhotoService {
	public List<Photo> findByNew(News news);
}
