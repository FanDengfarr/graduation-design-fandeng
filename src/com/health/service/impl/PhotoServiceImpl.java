package com.health.service.impl;

import com.health.dao.PhotoDao;
import com.health.service.PhotoService;

public class PhotoServiceImpl implements PhotoService {
	private PhotoDao photodao;

	public PhotoDao getPhotodao() {
		return photodao;
	}

	public void setPhotodao(PhotoDao photodao) {
		this.photodao = photodao;
	}

	
}
