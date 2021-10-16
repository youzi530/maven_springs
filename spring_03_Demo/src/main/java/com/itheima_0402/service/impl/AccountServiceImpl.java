package com.itheima_0402.service.impl;

import com.itheima_0402.service.IAccountService;

public class AccountServiceImpl implements IAccountService {


    public AccountServiceImpl(){
        System.out.println("对象创建了！！");
    }

    public void saveAccount() {
        System.out.println("service中的saveAccount方法执行了！！！");
    }

    public void init(){
        System.out.println("对象初始化成功！！");
    }

    public void destory(){
        System.out.println("对象销毁成功！！");
    }
}
