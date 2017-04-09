package com.health.action;

import com.health.service.AdminService;
import com.opensymphony.xwork2.ActionSupport;

public class AdminLoginAction extends ActionSupport {
	private AdminService adminservice;
	private String admin;
	private String adpwd;

	public AdminService getAdminservice() {
		return adminservice;
	}

	public void setAdminservice(AdminService adminservice) {
		this.adminservice = adminservice;
	}

	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

	public String getAdpwd() {
		return adpwd;
	}

	public void setAdpwd(String adpwd) {
		this.adpwd = adpwd;
	}

	public String adminlogin() {
		Boolean flag = adminservice.adminlogin(admin, adpwd);
		if (flag) {
			return SUCCESS;
		} else {
			return INPUT;
		}
	}
}
