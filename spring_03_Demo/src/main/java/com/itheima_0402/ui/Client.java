package com.itheima_0402.ui;

import com.itheima_0402.service.IAccountService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟表现层（用于调用业务层，实际上是一个servlet）
 */
public class Client {


    public static void main(String[] args) {

        //1、获取核心容器对象
        //ApplicationContext ac = new ClassPathXmlApplicationContext("itheimabean.xml");
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("itheimabean.xml");

        //2、根据id获取Bean对象
        IAccountService as = (IAccountService) ac.getBean("accountService");

        System.out.println(as);
        as.saveAccount();

        //容器自动关闭
        ac.close();
   }

}
