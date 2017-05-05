package com.health.dao.impl;

import java.util.*; 

import org.hibernate.Query;
import org.hibernate.Session;

import com.health.common.impl.*;
import com.health.dao.CommentDao;
import com.health.pojo.Comment;
import com.health.pojo.News;

public class CommentDaoImpl extends BaseDaoHibernate3
	implements CommentDao
{
	public Comment get(Integer id)
	{
		return (Comment)getHibernateTemplate()
			.get(Comment.class , id);
	}

	public Integer save(Comment comment)
	{
		return (Integer)getHibernateTemplate()
			.save(comment);
	}
	public void update(Comment comment)
	{
		getHibernateTemplate()
			.update(comment);
	}

	public void delete(Comment comment)
	{
		getHibernateTemplate()
			.delete(comment);
	}

	public void delete(Integer id)
	{
		getHibernateTemplate()
			.delete(get(id));
	}

	public List<Comment> findAll()
	{
		return (List<Comment>)getHibernateTemplate()
			.find("from Comment");
	}


	
	public List<Comment> findById(Integer id)
	{
		List<Comment> comments = (List<Comment>)getHibernateTemplate()
			.find("from Comment where comid = ? " , id);
		if (comments!= null &&comments.size() >= 1)
		{
			return comments;
		}
		return null;
	}
	
	public List<Comment> findByNew(News news)
	{
		return (List<Comment>)getHibernateTemplate()
			.find("from Comment as p where "
			+ "p.news = ?" , news);
	}
	
	
}
