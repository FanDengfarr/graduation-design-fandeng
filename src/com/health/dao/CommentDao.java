package com.health.dao;

import java.util.List;

import com.health.pojo.Comment;
import com.health.pojo.News;

public interface CommentDao {
	Comment get(Integer id);

	Integer save(Comment comment);

	void update(Comment comment);

	void delete(Comment comment);

	void delete(Integer id);

	List<Comment> findAll();
	List<Comment> findById(Integer id);
	List<Comment> findByNew(News news);
}
