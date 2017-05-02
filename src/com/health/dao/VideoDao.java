package com.health.dao;

import java.util.List;

import com.health.pojo.Video;;

public interface VideoDao {
	Video get(Integer id);

	Integer save(Video video);

	void update(Video video);

	void delete(Video video);

	void delete(Integer id);

	List<Video> findAll();

	Video findByName(String name);
	public List<Video> queryForPage(final String hql,final int offset,final int length);    
	/**   
	 * ��ѯ���еļ�¼��   
	 * @param hql ��ѯ����   
	 * @return �ܼ�¼��   
	 */    
	public int getAllRowCount(String hql);    

	
}
