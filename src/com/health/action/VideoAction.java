package com.health.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.health.pojo.Video;
import com.health.service.VideoService;
import com.opensymphony.xwork2.*;

import org.apache.struts2.interceptor.*;
import org.jboss.weld.context.ApplicationContext;

public class VideoAction extends ActionSupport{
	private VideoService videoservice;
	private Video video;
	private List<Video> listvideo;
	private Integer vid;

	

	public VideoService getVideoservice() {
		return videoservice;
	}



	public void setVideoservice(VideoService videoservice) {
		this.videoservice = videoservice;
	}



	public Video getVideo() {
		return video;
	}



	public List<Video> getListvideo() {
		return listvideo;
	}



	public void setListvideo(List<Video> listvideo) {
		this.listvideo = listvideo;
	}



	public void setVideo(Video video) {
		this.video = video;
	}

	public Integer getVid() {
		return vid;
	}



	public void setVid(Integer vid) {
		this.vid = vid;
	}



	public String show(){
		this.listvideo=videoservice.findById(vid);
		return SUCCESS;
        
    }
		
}