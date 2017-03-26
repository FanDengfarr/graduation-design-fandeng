package com.health.pojo;

/**
 * Admin entity. @author MyEclipse Persistence Tools
 */

public class Admin implements java.io.Serializable {

	// Fields

	private Integer id;
	private String admin;
	private String adpwd;

	// Constructors

	/** default constructor */
	public Admin() {
	}

	/** full constructor */
	public Admin(String admin, String adpwd) {
		this.admin = admin;
		this.adpwd = adpwd;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAdmin() {
		return this.admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

	public String getAdpwd() {
		return this.adpwd;
	}

	public void setAdpwd(String adpwd) {
		this.adpwd = adpwd;
	}

}