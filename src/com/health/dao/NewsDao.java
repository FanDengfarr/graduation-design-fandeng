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
	 * 查询所有的记录数   
	 * @param hql 查询条件   
	 * @return 总记录数   
	 */    
	public int getAllRowCount(String hql);    
	   
}
