package com.health.action;

import java.sql.Timestamp;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.health.pojo.Video;
import com.health.pojo.Pagebean;
import com.health.service.VideoService;
import com.opensymphony.xwork2.*;

import org.apache.struts2.interceptor.*;

public class ListVideoAction extends ActionSupport{
	private String title;
    private VideoService videoservice;    
    private Pagebean pagebean; //封装了分页信息和数据内容的pageBean    
    private List<Video> listVideo;  
    private int page = 1; //表示从网页中返回的当前页的值  默认为1 表示默认显示第一页内容    
    public int getPage() {    
    return page;    
    }    
   
	public Pagebean getPagebean() {
		return pagebean;
	}

	public void setPagebean(Pagebean pagebean) {
		this.pagebean = pagebean;
	}

	public VideoService getVideoservice() {
		return videoservice;
	}

	public void setVideoservice(VideoService videoservice) {
		this.videoservice = videoservice;
	}


	public List<Video> getListVideo() {
		return listVideo;
	}



	public void setListVideo(List<Video> listVideo) {
		this.listVideo = listVideo;
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
    this.pagebean = videoservice.queryForPage(9, page);//获取封装了分页信息和数据的pageBean    
    this.listVideo = this.pagebean.getListvideo(); //获取数据    
    return SUCCESS;    
    }    
}