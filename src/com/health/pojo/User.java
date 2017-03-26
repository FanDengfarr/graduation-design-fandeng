package com.health.pojo;

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

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(String username, String password, String state,
			String actiCode, String tokenExptime) {
		this.username = username;
		this.password = password;
		this.state = state;
		this.actiCode = actiCode;
		this.tokenExptime = tokenExptime;
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

}