package com.health.action.base;

import com.health.service.UserManager;
import com.opensymphony.xwork2.ActionSupport;
import com.health.service.*;

/**
 * Description:
 * <br/>Copyright (C), 2001-2010, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class UserBaseAction extends ActionSupport
{
    protected UserManager mgr;

    public void setUserManager(UserManager mgr)
    {
        this.mgr = mgr;
    }
}