package com.health.service;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder.In;

import com.health.pojo.News;
import com.health.pojo.Pagebean;

public interface NewsService {
	 public List<News> findById(Integer id);
	 public Pagebean queryForPage(int pageSize,int page); 
	 public List<News> findAll();
	 public void update(News news);
	 public Pagebean queryForPageCount(int pageSize,int page);
}
	