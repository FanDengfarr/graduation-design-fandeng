package com.health.action;

import com.health.pojo.User;
import com.health.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")
public class RegisterAction extends ActionSupport implements ModelDriven {
	private String result;
	private UserService userservice;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

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
		this.user.setUsername(user.getUsername());
		this.user.setName(user.getName());
		this.user.setPassword(user.getPassword());
		this.user = user;
	}

	public String register() {
		if (userservice.register(user) == true)
			return SUCCESS;
		else
			return INPUT;

	}

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		if (user == null)
			user = new User();
		return user;
	}
}
