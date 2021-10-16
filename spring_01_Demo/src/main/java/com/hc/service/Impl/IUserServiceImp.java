package com.hc.service.Impl;

import com.hc.dao.IUserDao;
import com.hc.dao.Impl.IUserDaoImp;
import com.hc.service.IUserService;

public class IUserServiceImp implements IUserService {
    IUserDao iUserDao = new IUserDaoImp();
    int i = 0;

    public IUserServiceImp(){
        System.out.println("UserService 无惨构造方法");
    }


    public void findUser() {
        i++;
        iUserDao.findUserById();
        System.out.println(i);
    }
}
