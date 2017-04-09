package com.health.service.impl;

import com.health.dao.AdminDao;
import com.health.service.AdminService;

public class AdminServiceImpl implements AdminService {
	private AdminDao admindao;

	public AdminDao getAdmindao() {
		return admindao;
	}

	public void setAdmindao(AdminDao admindao) {
		this.admindao = admindao;
	}

	public boolean adminlogin(String admin, String adpwd) {
		return admindao.adminlogin(admin, adpwd);
	}
}
