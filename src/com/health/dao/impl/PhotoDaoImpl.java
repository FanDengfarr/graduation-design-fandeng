package com.health.dao.impl;

import java.util.List;

import com.health.common.impl.BaseDaoHibernate3;
import com.health.dao.PhotoDao;
import com.health.pojo.News;
import com.health.pojo.Photo;

public class PhotoDaoImpl extends BaseDaoHibernate3 implements PhotoDao {

	public Photo get(Integer id) {
		return (Photo) getHibernateTemplate().get(Photo.class, id);
	}

	public Integer save(Photo photo) {
		return (Integer) getHibernateTemplate().save(photo);
	}

	public void update(Photo photo) {
		getHibernateTemplate().update(photo);
	}

	public void delete(Photo photo) {
		getHibernateTemplate().delete(photo);
	}

	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}

	public List<Photo> findAll() {
		return (List<Photo>) getHibernateTemplate().find("from Photo");
	}

	public List<Photo> findById(Integer id)
	{
		List<Photo> photos = (List<Photo>)getHibernateTemplate()
			.find("from Photo where pid = ? " , id);
		if (photos!= null && photos.size() >= 1)
		{
			return photos;
		}
		return null;
	}

	public List<Photo> findByNew(News news)
	{
		return (List<Photo>)getHibernateTemplate()
			.find("from Photo as p where "
			+ "p.news = ?" , news);
	}

}
