package com.health.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.health.pojo.News;
import com.health.pojo.Photo;
import com.health.service.NewsService;
import com.health.service.PhotoService;
import com.opensymphony.xwork2.*;

import org.apache.struts2.interceptor.*;
import org.jboss.weld.context.ApplicationContext;

public class PhotoAction extends ActionSupport{
    private  PhotoService photoservice;
	private Photo photo;
	private List<Photo> listphoto;
	private NewsService newsservice;
	private News news;
	private List<News> listNews;
	private Integer nid;

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


	public List<Photo> getListphoto() {
		return listphoto;
	}


	public void setListphoto(List<Photo> listphoto) {
		this.listphoto = listphoto;
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


	public Integer getNid() {
		return nid;
	}


	public void setNid(Integer nid) {
		this.nid = nid;
	}


	public String show(){
		this.listNews=newsservice.findById(nid);
		ActionContext ctx=ActionContext.getContext();
		for(int i=0;i<listNews.size();i++){
		this.listphoto=photoservice.findByNew(listNews.get(i));		
		}
		
		
		return SUCCESS;
        
    }
		
}