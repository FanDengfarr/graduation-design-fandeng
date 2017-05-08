package com.health.action;

import java.sql.Timestamp;
import java.util.List;

import com.health.pojo.News;
import com.health.pojo.User;
import com.health.service.NewsService;
import com.health.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class NewsMngAction extends ActionSupport implements ModelDriven {
	private UserService userservice;
	private NewsService newsservice;
	private News news;
	private List<News> listNews;
	private User user;
	private List<User> listUsers;
	public UserService getUserservice() {
		return userservice;
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

	public String show(){
		Timestamp time = new Timestamp(new java.util.Date().getTime());
		ActionContext ctx=ActionContext.getContext();
		String username1=(String) ctx.getSession().get("username");
		this.listUsers=userservice.findByName(username1);
		news.setTitle(news.getTitle());
		news.setContext(news.getContext());
		news.setVip("no");
		news.setUser(listUsers.get(0));
		news.setAuthor(listUsers.get(0).getName());
		news.setCreatetime(time);
		newsservice.save(news);
		return SUCCESS;
		
	}

	@Override
	public Object getModel() {
		if (news == null)
			news = new News();
		return news;
	}

}
