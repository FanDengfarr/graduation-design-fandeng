package com.health.service;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder.In;

import com.health.pojo.Comment;
import com.health.pojo.News;
import com.health.pojo.Photo;


public interface CommentService {
	 public void update(Comment comment);
	 public List<Comment> findByNew(News news);
	 public void save(Comment comment);
}
	