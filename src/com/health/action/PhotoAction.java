package com.health.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.health.pojo.News;
import com.health.pojo.Photo;
import com.health.service.NewsService;
import com.health.service.PhotoService;
import com.opensymphony.xwork2.*;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.*;
import org.jboss.weld.context.ApplicationContext;

public class PhotoAction extends ActionSupport{
	private File file1 ;
	private String fileFileName;
    private  PhotoService photoservice;
	private Photo photo;
	private List<Photo> listphoto;
	private NewsService newsservice;
	private News news;
	private List<News> listNews;
	private Integer nid;

	


	public String getFileFileName() {
		return fileFileName;
	}


	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}


	public File getFile1() {
		return file1;
	}


	public void setFile1(File file1) {
		this.file1 = file1;
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
		this.listphoto=photoservice.findByNew(listNews.get(0));		

		
		
		return SUCCESS;
        
    }
	public String upload() throws Exception{
		String path = ServletActionContext.getRequest().getRealPath("/images/photo");  
        //Êä³öÁ÷  
		File target=new File(path,fileFileName);
		FileUtils.copyFile(file1, target);
		String s=getFileFileName().toString();//Í¼Æ¬name
         System.out.print(s); 
   
          
		return SUCCESS;
		
	}
		
}