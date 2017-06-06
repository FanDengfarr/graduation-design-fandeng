package com.health.pojo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * News entity. @author MyEclipse Persistence Tools
 */

public class News  implements java.io.Serializable {


    // Fields    

     private Integer nid;
     private User user;
     private String title;
     private String context;
     private String author;
     private Timestamp createtime;
     private Integer count;
     private String vip;
     private String sort;
     private Set photos = new HashSet(0);
     private Set comments = new HashSet(0);


    // Constructors

    /** default constructor */
    public News() {
    }

    
    /** full constructor */
    public News(User user, String title, String context, String author, Timestamp createtime, Integer count, String vip, String sort, Set photos, Set comments) {
        this.user = user;
        this.title = title;
        this.context = context;
        this.author = author;
        this.createtime = createtime;
        this.count = count;
        this.vip = vip;
        this.sort = sort;
        this.photos = photos;
        this.comments = comments;
    }

   
    // Property accessors

    public Integer getNid() {
        return this.nid;
    }
    
    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return this.context;
    }
    
    public void setContext(String context) {
        this.context = context;
    }

    public String getAuthor() {
        return this.author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }

    public Timestamp getCreatetime() {
        return this.createtime;
    }
    
    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public Integer getCount() {
        return this.count;
    }
    
    public void setCount(Integer count) {
        this.count = count;
    }

    public String getVip() {
        return this.vip;
    }
    
    public void setVip(String vip) {
        this.vip = vip;
    }

    public String getSort() {
        return this.sort;
    }
    
    public void setSort(String sort) {
        this.sort = sort;
    }

    public Set getPhotos() {
        return this.photos;
    }
    
    public void setPhotos(Set photos) {
        this.photos = photos;
    }

    public Set getComments() {
        return this.comments;
    }
    
    public void setComments(Set comments) {
        this.comments = comments;
    }
   








}