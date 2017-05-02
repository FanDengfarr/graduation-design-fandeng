package com.health.service.impl;

import java.util.List;

import com.health.dao.VideoDao;
import com.health.pojo.Pagebean;
import com.health.pojo.Video;
import com.health.service.VideoService;

public class VideoServiceImpl implements VideoService {
	private VideoDao videodao;

	public VideoDao getVideodao() {
		return videodao;
	}

	public void setVideodao(VideoDao videodao) {
		this.videodao = videodao;
	}

	public Pagebean queryForPage(int pageSize, int page) {    
		final String hql = "from Video videos order by videos.vid DESC"; //查询语句    
		int allRow = videodao.getAllRowCount(hql);  //总记录数    
		int totalPage = Pagebean.countTatalPage(pageSize, allRow); //总页数    
		final int offset = Pagebean.countOffset(pageSize, page); //当前页开始记录    
		final int length = pageSize; // 每页记录数    
		final int currentPage = Pagebean.countCurrentPage(page); // 当前页    
		List list = videodao.queryForPage(hql, offset, length); //    
		//把分页信息保存到Bean当中    
		Pagebean pagebean  = new Pagebean();    
		pagebean.setPageSize(pageSize);    
		pagebean.setCurrentPage(currentPage);    
		pagebean.setAllRow(allRow);    
		pagebean.setTotalPage(totalPage);    
		pagebean.setListvideo(list);;    
		pagebean.init();    
		return pagebean;    
		}    
	
}
