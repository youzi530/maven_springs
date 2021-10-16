package com.hc.test;

import com.hc.bean.BeanFactory;
import com.hc.service.Impl.IUserServiceImp;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestServlet {
    //JavaBean  用Java语言来实现的可重用组件
    //Bean:可重用组件
    //BeanFactory作用:解耦，IOC，创建对象交由spring的bean工厂来实现，反转

    public static void main(String[] args) throws Exception {

        //背景：目标类和实现类:IUserService userService =new  主动new,主动获取实例对象 ，耦合度高

        //1、知道类的全路径--反射Class类对象--方法--默认会调用无参构造方法--实例对象
        // IUserService userService = (IUserService) Class.forName("com.hc.service.impl.UserService").newInstance()
        //IUserServiceImp iUserServiceImp = (IUserServiceImp) BeanFactory.getBean("userService");
        //iUserServiceImp.findUser();

        //2、判断单例还是多例:servlet是单例模式，而在这里，是多例，每次的i都是1，都是新的值
        //for (int i = 0; i < 4; i++) {
        //    IUserServiceImp iUserServiceImp = (IUserServiceImp) BeanFactory.getBean("userService");
        //    iUserServiceImp.findUser();
        //    System.out.println(iUserServiceImp);
        //    System.out.println("===================");
        //}

        //3、使用spring来实现spring
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        for (int i = 0; i < 4; i++) {
            IUserServiceImp iUserServiceImp = (IUserServiceImp) applicationContext.getBean("iUserServiceImp");
            //IUserServiceImp iUserServiceImp2 = (IUserServiceImp) applicationContext.getBean("iUserServiceImp",IUserServiceImp.class);
            //iUserServiceImp.findUser();
            System.out.println(iUserServiceImp);
        }

    }
}
