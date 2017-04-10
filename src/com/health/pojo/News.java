package com.health.pojo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * News entity. @author MyEclipse Persistence Tools
 */

public class News implements java.io.Serializable {

	// Fields

	private Integer nid;
	private String title;
	private String context;
	private String author;
	private Timestamp createtime;
	private Set photos = new HashSet(0);

	// Constructors

	/** default constructor */
	public News() {
	}

	/** full constructor */
	public News(String title, String context, String author,
			Timestamp createtime, Set photos) {
		this.title = title;
		this.context = context;
		this.author = author;
		this.createtime = createtime;
		this.photos = photos;
	}

	// Property accessors

	public Integer getNid() {
		return this.nid;
	}

	public void setNid(Integer nid) {
		this.nid = nid;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContext() {
		return this.context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Timestamp getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

	public Set getPhotos() {
		return this.photos;
	}

	public void setPhotos(Set photos) {
		this.photos = photos;
	}

}