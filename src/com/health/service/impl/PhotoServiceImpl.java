package com.health.service.impl;

import java.util.List;

import com.health.dao.PhotoDao;
import com.health.pojo.News;
import com.health.pojo.Photo;
import com.health.service.PhotoService;

public class PhotoServiceImpl implements PhotoService {
	private PhotoDao photodao;

	public PhotoDao getPhotodao() {
		return photodao;
	}

	public void setPhotodao(PhotoDao photodao) {
		this.photodao = photodao;
	}
	public List<Photo> findByNew(News news){
		return photodao.findByNew(news);
	}
	public void update(Photo photo){
		photodao.update(photo);
	}
	public void delete(Photo photo){
		photodao.delete(photo);
	}
	public Integer save(Photo photo){
		return  photodao.save(photo);
	}
	
}
