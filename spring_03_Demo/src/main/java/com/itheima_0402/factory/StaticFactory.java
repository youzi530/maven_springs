package com.itheima_0402.factory;

import com.itheima_0402.service.IAccountService;
import com.itheima_0402.service.impl.AccountServiceImpl;

/**
 * 模拟一个工厂类
 * （该类可能存在jar包中，我们无法通过修改源码的方式来提供默认构造函数）
 */
public class StaticFactory {

    public static IAccountService getAccountService(){
        return new AccountServiceImpl();
    }

}
