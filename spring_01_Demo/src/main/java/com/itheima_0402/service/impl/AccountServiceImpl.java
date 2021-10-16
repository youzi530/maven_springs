package com.itheima_0402.service.impl;

import com.itheima_0402.dao.IAccountDao;
import com.itheima_0402.factory.BeanFactory;
import com.itheima_0402.service.IAccountService;

public class AccountServiceImpl implements IAccountService {

    //private IAccountDao accountDao = new AccountDaoImpl();
    private  IAccountDao accountDao = (IAccountDao) BeanFactory.getBean("accountDao");

    //private int i= 1;

    public void saveAccount() {
        int i= 1;
        accountDao.saveAccount();
        System.out.println(i);
        i++;
    }
}
