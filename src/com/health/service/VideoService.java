package com.health.service;

import java.util.List;

import com.health.pojo.Video;
import com.health.pojo.Pagebean;


public interface VideoService {
	 public Pagebean queryForPage(int pageSize,int page); 
	 public List<Video> findById(Integer id);
}
