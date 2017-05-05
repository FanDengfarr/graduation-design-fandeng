package com.health.pojo;

import java.sql.Timestamp;

/**
 * Comment entity. @author MyEclipse Persistence Tools
 */

public class Comment implements java.io.Serializable {

	// Fields

	private Integer comid;
	private User user;
	private News news;
	private String context;
	private Timestamp comtime;
	private String comname;

	// Constructors

	/** default constructor */
	public Comment() {
	}

	/** full constructor */
	public Comment(User user, News news, String context, Timestamp comtime,
			String comname) {
		this.user = user;
		this.news = news;
		this.context = context;
		this.comtime = comtime;
		this.comname = comname;
	}

	// Property accessors

	public Integer getComid() {
		return this.comid;
	}

	public void setComid(Integer comid) {
		this.comid = comid;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public News getNews() {
		return this.news;
	}

	public void setNews(News news) {
		this.news = news;
	}

	public String getContext() {
		return this.context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public Timestamp getComtime() {
		return this.comtime;
	}

	public void setComtime(Timestamp comtime) {
		this.comtime = comtime;
	}

	public String getComname() {
		return this.comname;
	}

	public void setComname(String comname) {
		this.comname = comname;
	}

}