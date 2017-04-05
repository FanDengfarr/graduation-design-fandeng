package com.health.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.health.service.UserService;
import com.opensymphony.xwork2.*;

import org.apache.struts2.interceptor.*;

public class LoginAction extends ActionSupport{
    private UserService userservice;
    private String password;
    private String username;
    
    
    public UserService getUserservice() {
        return userservice;
    }


    public void setUserservice(UserService userservice) {
        this.userservice = userservice;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public String login(){
        Boolean flag=userservice.login(username, password);
        if(flag){
            return SUCCESS;
        }else{
            return INPUT;
        }
    }
}