package com.health.action;

import java.util.List;

import com.health.pojo.News;
import com.health.pojo.User;
import com.health.service.NewsService;
import com.health.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven {
	private UserService userservice;
	private String newPass;
	private String newPass1;
	private User user;
	private List<User> listUsers;
	private NewsService newsservice;
	private News news;
	private List<News> listNews;
	public UserService getUserservice() {
		return userservice;
	}

	public String getNewPass() {
		return newPass;
	}

	public void setNewPass(String newPass) {
		this.newPass = newPass;
	}

	public String getNewPass1() {
		return newPass1;
	}

	public void setNewPass1(String newPass1) {
		this.newPass1 = newPass1;
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
		this.user = user;
	}

	public NewsService getNewsservice() {
		return newsservice;
	}

	public void setNewsservice(NewsService newsservice) {
		this.newsservice = newsservice;
	}

	public News getNews() {
		return news;
	}

	public void setNews(News news) {
		this.news = news;
	}

	public List<News> getListNews() {
		return listNews;
	}

	public void setListNews(List<News> listNews) {
		this.listNews = listNews;
	}

	public String changeName() {
		ActionContext ctx=ActionContext.getContext();
		String username1=(String) ctx.getSession().get("username");
		try {
			this.listUsers=userservice.findByName(username1);
			String name2=listUsers.get(0).getName();
			if(userservice.checkName(user.getName())==false){
			this.listNews=newsservice.findByAuth(name2);
			for(int i=0;i<listNews.size();i++){
			listNews.get(i).setAuthor(user.getName());
			newsservice.update(listNews.get(i));
			listUsers.get(0).setName(user.getName());
		}	
			}
			
			userservice.update(listUsers.get(0));
			return SUCCESS;
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
    public String changePass(){
    	if(userservice.checkPass(user.getPassword())&&this.getNewPass().equals(this.getNewPass1())&&!this.getNewPass().equals("")){
    		ActionContext ctx=ActionContext.getContext();
    		String username1=(String) ctx.getSession().get("username");
    		this.listUsers=userservice.findByName(username1);
    		listUsers.get(0).setPassword(this.getNewPass());
    		userservice.update(this.listUsers.get(0));
    		return SUCCESS;
    	}
    	else 
    		return INPUT;
    }
    public String showlist(){
		this.listUsers=userservice.findAll();
		return SUCCESS;
		
	}
	@Override
	public Object getModel() {
		if (user == null)
			user = new User();
		return user;
	}

}
