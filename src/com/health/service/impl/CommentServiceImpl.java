package com.health.service.impl;

import java.util.List;

import com.health.dao.CommentDao;
import com.health.pojo.Comment;
import com.health.pojo.News;
import com.health.service.CommentService;


public class CommentServiceImpl implements CommentService{
	private CommentDao commentdao;
   
	public CommentDao getCommentdao() {
		return commentdao;
	}
	public void setCommentdao(CommentDao commentdao) {
		this.commentdao = commentdao;
	}
	public List<Comment> findByNew(News news){
		return commentdao.findByNew(news);
	}
	public void update(Comment comment){
		commentdao.update(comment);
	}
	public void save(Comment comment){
		commentdao.save(comment);
	}
}