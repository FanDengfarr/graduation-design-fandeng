package com.health.dao.impl;

import java.util.*; 

import org.hibernate.Query;
import org.hibernate.Session;

import com.health.common.impl.*;
import com.health.dao.NewsDao;
import com.health.pojo.News;

public class NewsDaoImpl extends BaseDaoHibernate3
	implements NewsDao
{
	public News get(Integer id)
	{
		return (News)getHibernateTemplate()
			.get(News.class , id);
	}

	public Integer save(News news)
	{
		return (Integer)getHibernateTemplate()
			.save(news);
	}
	public void update(News news)
	{
		getHibernateTemplate()
			.update(news);
	}

	public void delete(News news)
	{
		getHibernateTemplate()
			.delete(news);
	}

	public void delete(Integer id)
	{
		getHibernateTemplate()
			.delete(get(id));
	}

	public List<News> findAll()
	{
		return (List<News>)getHibernateTemplate()
			.find("from News");
	}


	
	public List<News> findById(Integer id)
	{
		List<News> newss = (List<News>)getHibernateTemplate()
			.find("from News where nid = ? " , id);
		if (newss!= null && newss.size() >= 1)
		{
			return newss;
		}
		return null;
	}

	
	public int getAllRowCount(String hql) {    
		return this.getHibernateTemplate().find(hql).size();    
		}    
		/**   
		 * ��ҳ��ѯ   
		 * @param hql  ��ѯ����   
		 * @param offset  ��ʼ��¼   
		 * @param length  һ�β�ѯ������¼   
		 * @return ��ѯ�ļ�¼����   
		 */    
		@SuppressWarnings("unchecked")    
		public List<News> queryForPage(final String hql, final int offset, final int length) {    
		Session session = this.getSession();    
		Query q = session.createQuery(hql);    
		q.setFirstResult(offset);    
		q.setMaxResults(length);    
		List<News> list = q.list();    
		System.out.println(list.size());    
		session.close();    
		return list;    
	
	
}
}
