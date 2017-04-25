package com.health.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.health.pojo.News;
import com.health.pojo.Pagebean;
import com.health.service.NewsService;
import com.opensymphony.xwork2.*;

import org.apache.struts2.interceptor.*;
import org.jboss.weld.context.ApplicationContext;

public class HotNewsAction extends ActionSupport{
	private String title;
    private NewsService newsservice;    
    private Pagebean pagebean; //��װ�˷�ҳ��Ϣ���������ݵ�pageBean    
    private List<News> listNews;  
    private int page = 1; //��ʾ����ҳ�з��صĵ�ǰҳ��ֵ  Ĭ��Ϊ1 ��ʾĬ����ʾ��һҳ����    
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


	public String list(){
		this.pagebean = newsservice.queryForPageCount(5, page);//��ȡ��װ�˷�ҳ��Ϣ�����ݵ�pageBean    
	    this.listNews = this.pagebean.getList(); //��ȡ����    
	    return SUCCESS;    
        
    }
		
}