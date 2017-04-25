package com.health.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.health.pojo.News;
import com.health.service.NewsService;
import com.opensymphony.xwork2.*;

import org.apache.struts2.interceptor.*;
import org.jboss.weld.context.ApplicationContext;

public class NewsAction extends ActionSupport{
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

	public List<News> getListNews() {
		return listNews;
	}

	public void setListNews(List<News> listNews) {
		this.listNews = listNews;
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

	public String show(){
		this.listNews=newsservice.findById(nid);
		ActionContext ctx=ActionContext.getContext();
		for(int i=0;i<listNews.size();i++){
		if(listNews.get(i).getCount()!=null)
		listNews.get(i).setCount(listNews.get(0).getCount()+1);
		else{
			listNews.get(i).setCount(1);
			
		}
		newsservice.update(listNews.get(i));
		}
		
		
		return SUCCESS;
        
    }
		
}