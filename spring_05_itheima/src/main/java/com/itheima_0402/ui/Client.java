package com.itheima_0402.ui;

import com.itheima_0402.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟表现层（用于调用业务层，实际上是一个servlet）
 */
public class Client {

    public static void main(String[] args) {

        //1、获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("itheimabean_0501.xml");

        //2、根据id获取Bean对象
        IAccountService as = (IAccountService) ac.getBean("accountServiceImpl");
//        System.out.println(as);
//
//        IAccountDao adao = ac.getBean("accountDao",IAccountDao.class);
//        System.out.println(adao);
        as.saveAccount();

 }

}
