package com.health.pojo;

import java.sql.Timestamp;

/**
 * Comment entity. @author MyEclipse Persistence Tools
 */

public class Comment implements java.io.Serializable {

	// Fields

	private Integer comid;
	private News news;
	private String context;
	private Timestamp comtime;

	// Constructors

	/** default constructor */
	public Comment() {
	}

	/** full constructor */
	public Comment(News news, String context, Timestamp comtime) {
		this.news = news;
		this.context = context;
		this.comtime = comtime;
	}

	// Property accessors

	public Integer getComid() {
		return this.comid;
	}

	public void setComid(Integer comid) {
		this.comid = comid;
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

}