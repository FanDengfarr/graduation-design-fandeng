package com.health.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.health.pojo.News;
import com.health.service.NewsService;
import com.opensymphony.xwork2.*;

import org.apache.struts2.interceptor.*;

public class NewsAction extends ActionSupport{
    private NewsService newsservice;
	private News news;
	private List<News> listNews;
	private Integer nid;
	private Integer count;
    public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
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
		ActionContext ctx=ActionContext.getContext();
		
		this.listNews=newsservice.findById(nid);
		/*for(int i=0;i<listNews.size();i++){
		    news.setNid(listNews.get(0));
		    news.setUid(listNews.get(1));
		    news.setTitle(listNews.get(2));
		}
		Integer count=(Integer)ctx.getApplication().get(news.getCount());
		if(count == null)
			count = 1;
		else{
			count=count+1;
			newsservice.save(news);
		}
		*/
		return SUCCESS;
        
    }
}