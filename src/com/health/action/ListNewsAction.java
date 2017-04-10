package com.health.action;

import java.sql.Timestamp;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.health.pojo.News;
import com.health.pojo.Pagebean;
import com.health.service.NewsService;
import com.health.service.UserService;
import com.opensymphony.xwork2.*;

import org.apache.struts2.interceptor.*;

public class ListNewsAction extends ActionSupport{
	private String title;
    private NewsService newsservice;    
    private Pagebean pagebean; //封装了分页信息和数据内容的pageBean    
    private List<News> listNews;  
    private int page = 1; //表示从网页中返回的当前页的值  默认为1 表示默认显示第一页内容    
    public int getPage() {    
    return page;    
    }    
   
       
    public NewsService getNewsservice() {
		return newsservice;
	}


	public void setNewsservice(NewsService newsservice) {
		this.newsservice = newsservice;
	}


	public Pagebean getPagebean() {
		return pagebean;
	}


	public void setPagebean(Pagebean pagebean) {
		this.pagebean = pagebean;
	}


	public List<News> getListNews() {
		return listNews;
	}


	public void setListNews(List<News> listNews) {
		this.listNews = listNews;
	}


	public void setPage(int page) {
		this.page = page;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String list()throws Exception{    
    this.pagebean = newsservice.queryForPage(5, page);//获取封装了分页信息和数据的pageBean    
    this.listNews = this.pagebean.getList(); //获取数据    
    return SUCCESS;    
    }    
	
}