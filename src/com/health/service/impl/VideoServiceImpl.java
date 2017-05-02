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
		final String hql = "from Video videos order by videos.vid DESC"; //��ѯ���    
		int allRow = videodao.getAllRowCount(hql);  //�ܼ�¼��    
		int totalPage = Pagebean.countTatalPage(pageSize, allRow); //��ҳ��    
		final int offset = Pagebean.countOffset(pageSize, page); //��ǰҳ��ʼ��¼    
		final int length = pageSize; // ÿҳ��¼��    
		final int currentPage = Pagebean.countCurrentPage(page); // ��ǰҳ    
		List list = videodao.queryForPage(hql, offset, length); //    
		//�ѷ�ҳ��Ϣ���浽Bean����    
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
