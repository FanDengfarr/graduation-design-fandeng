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
import com.health.service.UserService;
import com.opensymphony.xwork2.*;

import org.apache.struts2.interceptor.*;
import org.jboss.weld.bean.NewSessionBean;
import org.jboss.weld.context.ApplicationContext;

public class CheckUserAction extends ActionSupport{
	
	private UserService userservice;
	private User user;
	private List<User> listuser;
	private Integer id;
	
	
	public UserService getUserservice() {
		return userservice;
	}

	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getListuser() {
		return listuser;
	}

	public void setListuser(List<User> listuser) {
		this.listuser = listuser;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String checkyes(){
		this.listuser=userservice.findById(id);
		listuser.get(0).setState("yes");
		userservice.update(listuser.get(0));
		return SUCCESS;
        
    }
	
	
	public String checkno(){
		this.listuser=userservice.findById(id);
		listuser.get(0).setState("no");
		userservice.update(listuser.get(0));
		return SUCCESS;
        
    }



	
		
}