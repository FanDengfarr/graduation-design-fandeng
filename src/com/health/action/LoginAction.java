package com.health.action;

import com.health.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private UserService userservice;

	private String password;
	private String username;
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UserService getUserservice() {
		return userservice;
	}

	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String login() {
		ActionContext ctx = ActionContext.getContext();
		Boolean flag = userservice.login(username, password);
		if (flag) {
			ctx.getSession().put("username", getUsername());
			return SUCCESS;
		} else {
			ctx.getSession().put("username", "");
			return INPUT;
		}
	}

	public String logout() {
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("username", "");
		return INPUT;
	}

}