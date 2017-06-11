package com.health.action;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.health.pojo.Comment;
import com.health.pojo.News;
import com.health.pojo.Photo;
import com.health.pojo.User;
import com.health.service.CommentService;
import com.health.service.NewsService;
import com.health.service.PhotoService;
import com.opensymphony.xwork2.*;

import org.apache.struts2.interceptor.*;
import org.jboss.weld.bean.NewSessionBean;
import org.jboss.weld.context.ApplicationContext;

public class CheckPhotoAction extends ActionSupport{
	
	private PhotoService photoservice;
	private Photo photo;
	private List<Photo> listPhoto;
	private Integer pid;
	private NewsService newsservice;
	private News news;
	private Integer nid;
	private List<News> listNews;
	
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

	public Integer getNid() {
		return nid;
	}

	public void setNid(Integer nid) {
		this.nid = nid;
	}

	public List<News> getListNews() {
		return listNews;
	}

	public void setListNews(List<News> listNews) {
		this.listNews = listNews;
	}

	public PhotoService getPhotoservice() {
		return photoservice;
	}

	public void setPhotoservice(PhotoService photoservice) {
		this.photoservice = photoservice;
	}

	public Photo getPhoto() {
		return photo;
	}

	public void setPhoto(Photo photo) {
		this.photo = photo;
	}

	public List<Photo> getListPhoto() {
		return listPhoto;
	}

	public void setListPhoto(List<Photo> listPhoto) {
		this.listPhoto = listPhoto;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String checkyes(){
		this.listNews=newsservice.findById(nid);
		this.listPhoto=photoservice.findById(pid);
		listPhoto.get(0).setState("yes");
		photoservice.update(listPhoto.get(0));
		return SUCCESS;
        
    }
	
	public String show(){
		this.listPhoto=photoservice.findById(pid);
		return SUCCESS;
        
    }
	
	public String checkno(){
		this.listNews=newsservice.findById(nid);
		this.listPhoto=photoservice.findById(pid);
		listPhoto.get(0).setState("no");
		photoservice.update(listPhoto.get(0));
		return SUCCESS;
        
    }



	
		
}