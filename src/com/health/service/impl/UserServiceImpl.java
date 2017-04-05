package com.health.service.impl;

import com.health.dao.UserDao;
import com.health.dao.impl.UserDaoImpl;

public class UserServiceImpl {
	private UserDao userdao;

    public void setUserdao(UserDaoImpl userdao) {
        this.userdao = userdao;
    }

    public boolean login(String username, String password) {
        return userdao.login(username, password);
    }

}