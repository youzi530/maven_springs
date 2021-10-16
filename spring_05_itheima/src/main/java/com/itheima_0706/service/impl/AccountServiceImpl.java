package com.itheima_0706.service.impl;

import com.itheima_0706.service.IAccountService;

/**
 * 账户的业务层实现类
 */

public class AccountServiceImpl implements IAccountService {

    public void saveAccount() {
        System.out.println("保存成功！！");
    }

    public void updateAccount(int i) {
        System.out.println("更新成功！！");
    }

    public int deleteAccount() {
        System.out.println("删除成功！！");
        return 0;
    }
}