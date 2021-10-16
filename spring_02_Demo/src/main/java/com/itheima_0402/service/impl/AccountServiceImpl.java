package com.itheima_0402.service.impl;

import com.itheima_0402.dao.IAccountDao;

import com.itheima_0402.dao.impl.AccountDaoImpl;
import com.itheima_0402.service.IAccountService;

public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao = new AccountDaoImpl();

    public AccountServiceImpl(){
        System.out.println("对象创建了！");
    }

    public void saveAccount() {
        accountDao.saveAccount();
    }
}
