package com.health.pojo;

/**
 * Video entity. @author MyEclipse Persistence Tools
 */

public class Video implements java.io.Serializable {

	// Fields

	private Integer vid;
	private String vname;
	private String vurl;
	private String vpurl;
	private String vcontext;

	// Constructors

	/** default constructor */
	public Video() {
	}

	/** full constructor */
	public Video(String vname, String vurl, String vpurl, String vcontext) {
		this.vname = vname;
		this.vurl = vurl;
		this.vpurl = vpurl;
		this.vcontext = vcontext;
	}

	// Property accessors

	public Integer getVid() {
		return this.vid;
	}

	public void setVid(Integer vid) {
		this.vid = vid;
	}

	public String getVname() {
		return this.vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public String getVurl() {
		return this.vurl;
	}

	public void setVurl(String vurl) {
		this.vurl = vurl;
	}

	public String getVpurl() {
		return this.vpurl;
	}

	public void setVpurl(String vpurl) {
		this.vpurl = vpurl;
	}

	public String getVcontext() {
		return this.vcontext;
	}

	public void setVcontext(String vcontext) {
		this.vcontext = vcontext;
	}

}