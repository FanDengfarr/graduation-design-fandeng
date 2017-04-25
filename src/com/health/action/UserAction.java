package com.health.action;

import com.health.pojo.User;
import com.health.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven {
	private UserService userservice;
	private User user;

	public UserService getUserservice() {
		return userservice;
	}

	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user.setName(user.getName());
		this.user = user;
	}

	public String changeName() {
		try {
			if (userservice.changeName(user) == true)
				return SUCCESS;
			else
				return INPUT;
		} catch (org.springframework.dao.DataIntegrityViolationException e) {
			return INPUT;
		}
	}

	@Override
	public Object getModel() {
		if (user == null)
			user = new User();
		return user;
	}

}
