package com.itheima_0706.test;

import com.itheima_0706.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {

    public static void main(String[] args) {
        //获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("itheimabean_0706.xml");
        //获取对象
        IAccountService as= (IAccountService) ac.getBean("accountService");
        //执行方法
        as.saveAccount();
    }
}
