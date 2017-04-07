package com.health.dao.impl;

import java.util.*; 

import com.health.common.impl.*;
import com.health.dao.UserDao;
import com.health.pojo.User;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
public class UserDaoImpl extends BaseDaoHibernate3
	implements UserDao
{
	public User get(Integer id)
	{
		return (User)getHibernateTemplate()
			.get(User.class , id);
	}

	public Integer save(User user)
	{
		return (Integer)getHibernateTemplate()
			.save(user);
	}
	public void update(User user)
	{
		getHibernateTemplate()
			.update(user);
	}

	public void delete(User user)
	{
		getHibernateTemplate()
			.delete(user);
	}

	public void delete(Integer id)
	{
		getHibernateTemplate()
			.delete(get(id));
	}

	public List<User> findAll()
	{
		return (List<User>)getHibernateTemplate()
			.find("from User");
	}

	public List<User> findByNameAndPass(String name
		 , String pass)
	{
        return (List<User>)getHibernateTemplate()
			.find("from User where username = ? and password = ?"
			, new String[]{name , pass}); 
	}

	
	public User findByName(String name)
	{
		@SuppressWarnings("unchecked")
		List<User> users = (List<User>)getHibernateTemplate()
			.find("from User where username = ? " , name);
		if (users!= null && users.size() >= 1)
		{
			return users.get(0);
		}
		return null;
	}
	@Override
    public boolean login(String username, String password) {
        @SuppressWarnings("unchecked")
		List<User> u=this.getHibernateTemplate().find("from User where username=? and password=?",username,password);
        Boolean flag=false;
        if(u.size()>0){
            flag=true;
        }
        return flag;
    }
	
}
