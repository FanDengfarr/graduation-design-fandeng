package com.health.dao.impl;

import java.util.List;

import com.health.common.impl.BaseDaoHibernate3;
import com.health.dao.AdminDao;
import com.health.pojo.Admin;

public class AdminDaoImpl extends BaseDaoHibernate3 implements AdminDao {

	public Admin get(Integer id) {
		return (Admin) getHibernateTemplate().get(Admin.class, id);
	}

	public Integer save(Admin admin) {
		return (Integer) getHibernateTemplate().save(admin);
	}

	public void update(Admin admin) {
		getHibernateTemplate().update(admin);
	}

	public void delete(Admin admin) {
		getHibernateTemplate().delete(admin);
	}

	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}

	public List<Admin> findAll() {
		return (List<Admin>) getHibernateTemplate().find("from Admin");
	}

	public List<Admin> findByNameAndPass(String admin, String adpwd) {
		return (List<Admin>) getHibernateTemplate().find(
				"from Admin where admin = ? and adpwd = ?",
				new String[] { admin, adpwd });
	}

	public Admin findByName(String admin) {
		@SuppressWarnings("unchecked")
		List<Admin> admins = (List<Admin>) getHibernateTemplate().find(
				"from Admin where admin = ? ", admin);
		if (admins != null && admins.size() >= 1) {
			return admins.get(0);
		}
		return null;
	}

	@Override
	public boolean adminlogin(String admin, String adpwd) {
		@SuppressWarnings("unchecked")
		List<Admin> a = this.getHibernateTemplate().find(
				"from Admin where admin=? and adpwd=?", admin, adpwd);
		Boolean flag = false;
		if (a.size() > 0) {
			flag = true;
		}
		return flag;
	}

}
