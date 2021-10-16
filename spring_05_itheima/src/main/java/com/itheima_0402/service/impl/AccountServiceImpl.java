package com.itheima_0402.service.impl;

import com.itheima_0402.dao.IAccountDao;
import com.itheima_0402.dao.impl.AccountDaoImpl;
import com.itheima_0402.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "accountServiceImpl")
public class AccountServiceImpl implements IAccountService {

//    @Autowired
////    @Qualifier("accountDao")
    @Resource(name = "accountDao")
    private IAccountDao accountDao;

    public void saveAccount() {
        accountDao.saveAccount();
    }


}
