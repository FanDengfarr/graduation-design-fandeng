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

public class CheckNewsAction extends ActionSupport{
	
	private NewsService newsservice;
	private News news;
	private List<News> listNews;
	private Integer nid;

	public Integer getNid() {
		return nid;
	}

	public void setNid(Integer nid) {
		this.nid = nid;
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

	public String showall(){
		this.listNews=newsservice.findAll();
		return SUCCESS;
        
    }
	
	public String showcheck(){
		this.listNews=newsservice.findcheck();
		return SUCCESS;
        
    }
	public String shownotcheck(){
		this.listNews=newsservice.findNotcheck();
		return SUCCESS;
        
    }
	public String checkyes(){
		this.listNews=newsservice.findById(nid);
		listNews.get(0).setVip("yes");
		newsservice.update(listNews.get(0));
		return SUCCESS;
        
    }
	
	public String checkno(){
		this.listNews=newsservice.findById(nid);
		listNews.get(0).setVip("no");
		newsservice.update(listNews.get(0));
		return SUCCESS;
        
    }



	
		
}