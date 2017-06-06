package com.health.pojo;



/**
 * Photo entity. @author MyEclipse Persistence Tools
 */

public class Photo  implements java.io.Serializable {


    // Fields    

     private Integer pid;
     private News news;
     private String pname;
     private String purl;


    // Constructors

    /** default constructor */
    public Photo() {
    }

	/** minimal constructor */
    public Photo(News news) {
        this.news = news;
    }
    
    /** full constructor */
    public Photo(News news, String pname, String purl) {
        this.news = news;
        this.pname = pname;
        this.purl = purl;
    }

   
    // Property accessors

    public Integer getPid() {
        return this.pid;
    }
    
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public News getNews() {
        return this.news;
    }
    
    public void setNews(News news) {
        this.news = news;
    }

    public String getPname() {
        return this.pname;
    }
    
    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPurl() {
        return this.purl;
    }
    
    public void setPurl(String purl) {
        this.purl = purl;
    }
   








}