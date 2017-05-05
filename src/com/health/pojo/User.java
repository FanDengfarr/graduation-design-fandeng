package com.health.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer id;
	private String username;
	private String password;
	private String state;
	private String actiCode;
	private String tokenExptime;
	private String name;
	private Set newses = new HashSet(0);
	private Set comments = new HashSet(0);

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String username, String name) {
		this.username = username;
		this.name = name;
	}

	/** full constructor */
	public User(String username, String password, String state,
			String actiCode, String tokenExptime, String name, Set newses,
			Set comments) {
		this.username = username;
		this.password = password;
		this.state = state;
		this.actiCode = actiCode;
		this.tokenExptime = tokenExptime;
		this.name = name;
		this.newses = newses;
		this.comments = comments;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getActiCode() {
		return this.actiCode;
	}

	public void setActiCode(String actiCode) {
		this.actiCode = actiCode;
	}

	public String getTokenExptime() {
		return this.tokenExptime;
	}

	public void setTokenExptime(String tokenExptime) {
		this.tokenExptime = tokenExptime;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getNewses() {
		return this.newses;
	}

	public void setNewses(Set newses) {
		this.newses = newses;
	}

	public Set getComments() {
		return this.comments;
	}

	public void setComments(Set comments) {
		this.comments = comments;
	}

}