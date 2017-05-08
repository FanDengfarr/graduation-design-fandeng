package com.health.service.impl;

import java.util.List;

import com.health.dao.NewsDao;
import com.health.pojo.News;
import com.health.pojo.Pagebean;
import com.health.service.NewsService;


public class NewsServiceImpl implements NewsService{
	private NewsDao newsdao;
	private News news;
   
	public NewsDao getNewsdao() {
		return newsdao;
	}




	public void setNewsdao(NewsDao newsdao) {
		this.newsdao = newsdao;
	}


	public List<News> findById(Integer id) {
        return newsdao.findById(id);
    }
	public List<News> findAll(){
		return newsdao.findAll();
	}
	public Pagebean queryForPage(int pageSize, int page) {    
		final String hql = "from News news where news.vip='yes' order by news.createtime DESC "; //��ѯ���    
		int allRow = newsdao.getAllRowCount(hql);  //�ܼ�¼��    
		int totalPage = Pagebean.countTatalPage(pageSize, allRow); //��ҳ��    
		final int offset = Pagebean.countOffset(pageSize, page); //��ǰҳ��ʼ��¼    
		final int length = pageSize; // ÿҳ��¼��    
		final int currentPage = Pagebean.countCurrentPage(page); // ��ǰҳ    
		List list = newsdao.queryForPage(hql, offset, length); //    
		//�ѷ�ҳ��Ϣ���浽Bean����    
		Pagebean pagebean  = new Pagebean();    
		pagebean.setPageSize(pageSize);    
		pagebean.setCurrentPage(currentPage);    
		pagebean.setAllRow(allRow);    
		pagebean.setTotalPage(totalPage);    
		pagebean.setList(list);    
		pagebean.init();    
		return pagebean;    
		}    
	public void update(News news){
		 newsdao.update(news);
	}
	public Pagebean queryForPageCount(int pageSize, int page) {    
		final String hql = "from News news where news.vip='yes' order by news.count DESC "; //��ѯ���    
		int allRow = newsdao.getAllRowCount(hql);  //�ܼ�¼��    
		int totalPage = Pagebean.countTatalPage(pageSize, allRow); //��ҳ��    
		final int offset = Pagebean.countOffset(pageSize, page); //��ǰҳ��ʼ��¼    
		final int length = pageSize; // ÿҳ��¼��    
		final int currentPage = Pagebean.countCurrentPage(page); // ��ǰҳ    
		List list = newsdao.queryForPage(hql, offset, length); //    
		//�ѷ�ҳ��Ϣ���浽Bean����    
		Pagebean pagebean  = new Pagebean();    
		pagebean.setPageSize(pageSize);    
		pagebean.setCurrentPage(currentPage);    
		pagebean.setAllRow(allRow);    
		pagebean.setTotalPage(totalPage);    
		pagebean.setList(list);    
		pagebean.init();    
		return pagebean;    
		}    
	public Integer save(News news){
		return  newsdao.save(news);
	}

		  
}