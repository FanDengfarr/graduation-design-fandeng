package com.health.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.health.common.impl.BaseDaoHibernate3;
import com.health.dao.NewsDao;
import com.health.pojo.News;

public class NewsDaoImpl extends BaseDaoHibernate3 implements NewsDao {
	public News get(Integer id) {
		return (News) getHibernateTemplate().get(News.class, id);
	}

	public Integer save(News news) {
		return (Integer) getHibernateTemplate().save(news);
	}

	public void update(News news) {
		getHibernateTemplate().update(news);
	}

	public void delete(News news) {
		getHibernateTemplate().delete(news);
	}

	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}

	public List<News> findAll() {
		return (List<News>) getHibernateTemplate().find("from News");
	}

	public List<News> findcheck() {
		return (List<News>) getHibernateTemplate().find(
				"from News where vip = 'yes'");
	}

	public List<News> findNotcheck() {
		return (List<News>) getHibernateTemplate().find(
				"from News where vip = 'no'");
	}

	public List<News> findByAuth(String auth) {
		List<News> newss = (List<News>) getHibernateTemplate().find(
				"from News where author = ? ", auth);
		if (newss != null && newss.size() >= 1) {
			return newss;
		}
		return null;
	}

	public List<News> findhealth() {
		return (List<News>) getHibernateTemplate().find(
				"from News where sort = '健身' and vip = 'yes'");
	}

	public List<News> finddiet() {
		return (List<News>) getHibernateTemplate().find(
				"from News where sort = '饮食' and vip = 'yes'");
	}

	public List<News> findrest() {
		return (List<News>) getHibernateTemplate().find(
				"from News where sort = '养生' and vip = 'yes'");
	}

	public List<News> findById(Integer id) {
		List<News> newss = (List<News>) getHibernateTemplate().find(
				"from News where nid = ? ", id);
		if (newss != null && newss.size() >= 1) {
			return newss;
		}
		return null;
	}

	public int getAllRowCount(String hql) {
		return this.getHibernateTemplate().find(hql).size();
	}

	/**
	 * ��ҳ��ѯ
	 * 
	 * @param hql
	 *            ��ѯ����
	 * @param offset
	 *            ��ʼ��¼
	 * @param length
	 *            һ�β�ѯ������¼
	 * @return ��ѯ�ļ�¼����
	 */
	@SuppressWarnings("unchecked")
	public List<News> queryForPage(final String hql, final int offset,
			final int length) {
		Session session = this.getSession();
		Query q = session.createQuery(hql);
		q.setFirstResult(offset);
		q.setMaxResults(length);
		List<News> list = q.list();
		session.close();
		return list;

	}

	public List<News> search(String title) {
		List<News> newss = (List<News>) getHibernateTemplate()
				.find("from News where title like '%" + title
						+ "%' and vip = 'yes' ");
		if (newss != null && newss.size() >= 1) {
			return newss;
		}
		return null;

	}
}
