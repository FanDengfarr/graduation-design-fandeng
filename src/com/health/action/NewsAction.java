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
import org.jboss.weld.context.ApplicationContext;

public class NewsAction extends ActionSupport implements ModelDriven {
	private PhotoService photoservice;
	private String opttype;
	private String title;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOpttype() {
		return opttype;
	}

	public void setOpttype(String opttype) {
		this.opttype = opttype;
	}

	private Photo photo;
	private List<Photo> listphoto;
	private List<Comment> listcomment;
    public List<Comment> getListcomment() {
		return listcomment;
	}

	public void setListcomment(List<Comment> listcomment) {
		this.listcomment = listcomment;
	}

	private NewsService newsservice;
	private News news;
	private CommentService commentservice;
	private Comment comment;
	private List<News> listNews;
	private Integer nid;

	public Integer getNid() {
		return nid;
	}

	public PhotoService getPhotoservice() {
		return photoservice;
	}

	public void setPhotoservice(PhotoService photoservice) {
		this.photoservice = photoservice;
	}

	public CommentService getCommentservice() {
		return commentservice;
	}

	public void setCommentservice(CommentService commentservice) {
		this.commentservice = commentservice;
	}

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
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
		Timestamp time = new Timestamp(new java.util.Date().getTime());
		this.listNews=newsservice.findById(nid);
		ActionContext ctx=ActionContext.getContext();
		for(int i=0;i<listNews.size();i++){
			this.listphoto=photoservice.findByNew(listNews.get(i));
			this.listcomment=commentservice.findByNew(listNews.get(i));	
		if(listNews.get(i).getCount()!=null)
		listNews.get(i).setCount(listNews.get(0).getCount()+1);
		else{
			listNews.get(i).setCount(1);
			
		}
		newsservice.update(listNews.get(i));
		}
		Map request = (Map) ActionContext.getContext().get("request"); 
		String opttype=(String)request.get("opttype");
		if("comment".equals(opttype)){
        String con=(String)request.get("context");
		String comname1=(String) ctx.getSession().get("username");
		comment.setContext(comment.getContext());
		comment.setComtime(time);
		comment.setNews(listNews.get(0));
		if(comname1!=null&&comname1!=""&&!"".equals(con)){
			comment.setComname(comname1);
			commentservice.save(comment);
			this.listcomment=commentservice.findByNew(listNews.get(0));
			}
		}
		return SUCCESS;
        
    }
	public String search(){
		this.listNews=newsservice.search(title);
		if(this.listNews==null){
			return INPUT;
		}
		return SUCCESS;
		
	}
		
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		if (comment == null)
			comment = new Comment();
		return comment;
	}

	
		
}