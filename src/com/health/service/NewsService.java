package com.health.service;

import java.util.List;

import com.health.pojo.News;
import com.health.pojo.Pagebean;

public interface NewsService {
	 public List<News> findById(Integer id);
	 public Pagebean queryForPage(int pageSize,int page); 
	 public List<News> findAll();
	}
	