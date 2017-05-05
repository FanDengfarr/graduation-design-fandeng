package com.health.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.health.common.impl.BaseDaoHibernate3;
import com.health.dao.VideoDao;
import com.health.pojo.Video;

public class VideoDaoImpl extends BaseDaoHibernate3 implements VideoDao {

	public Video get(Integer id) {
		return (Video) getHibernateTemplate().get(Video.class, id);
	}

	public Integer save(Video video) {
		return (Integer) getHibernateTemplate().save(video);
	}

	public void update(Video video) {
		getHibernateTemplate().update(video);
	}

	public void delete(Video video) {
		getHibernateTemplate().delete(video);
	}

	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}

	public List<Video> findAll() {
		return (List<Video>) getHibernateTemplate().find("from Video");
	}


	public Video findByName(String video) {
		@SuppressWarnings("unchecked")
		List<Video> videos = (List<Video>) getHibernateTemplate().find(
				"from Video where video = ? ", video);
		if (videos != null && videos.size() >= 1) {
			return videos.get(0);
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
		public List<Video> queryForPage(final String hql, final int offset, final int length) {    
		Session session = this.getSession();    
		Query q = session.createQuery(hql);    
		q.setFirstResult(offset);    
		q.setMaxResults(length);    
		List<Video> list = q.list();      
		session.close();    
		return list;    
		}
		public List<Video> findById(Integer id)
		{
			List<Video> videos = (List<Video>)getHibernateTemplate()
				.find("from Video where vid = ? " , id);
			if (videos!= null && videos.size() >= 1)
			{
				return videos;
			}
			return null;
		}
}
