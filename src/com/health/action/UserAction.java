package com.health.action;

import java.util.List;

import com.health.pojo.User;
import com.health.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven {
	private UserService userservice;
	private User user;
	private List<User> listUsers;
	public UserService getUserservice() {
		return userservice;
	}

	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}

	public List<User> getListUsers() {
		return listUsers;
	}

	public void setListUsers(List<User> listUsers) {
		this.listUsers = listUsers;
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
	public String show(){
		ActionContext ctx=ActionContext.getContext();
		String username1=(String) ctx.getSession().get("username");
		this.listUsers=userservice.findByName(username1);
		ctx.getSession().put("name1", listUsers.get(0).getName());
		return SUCCESS;
		
	}

	@Override
	public Object getModel() {
		if (user == null)
			user = new User();
		return user;
	}

}
