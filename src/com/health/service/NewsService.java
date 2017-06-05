package com.health.service;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder.In;

import com.health.pojo.News;
import com.health.pojo.Pagebean;

public interface NewsService {
	 public List<News> findById(Integer id);
	 public Pagebean queryForPage(int pageSize,int page); 
	 public List<News> findAll();
	 public List<News> findcheck();
	 public List<News> findNotcheck();
	 public List<News> search(String title);
	 public void update(News news);
	 public Pagebean queryForPageCount(int pageSize,int page);
	 public Integer save(News news);
	 public List<News> findByAuth(String auth);
	 public void delete(News news);
}
	