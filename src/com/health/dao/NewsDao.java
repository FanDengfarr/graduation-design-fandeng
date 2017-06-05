package com.health.dao;
import java.util.List;

import com.health.pojo.News;
public interface NewsDao{
	News get(Integer id);

	Integer save(News news);

	
	void update(News news);

	
	void delete(News news);

	
	void delete(Integer id);

	List<News> findAll();
	List<News> findcheck();
	List<News> findNotcheck();
	List<News> findByAuth(String auth);


	List<News> findById(Integer id);
	public List<News> queryForPage(final String hql,final int offset,final int length);    
	/**   
	 * ��ѯ���еļ�¼��   
	 * @param hql ��ѯ����   
	 * @return �ܼ�¼��   
	 */    
	public int getAllRowCount(String hql);    
	   
}
