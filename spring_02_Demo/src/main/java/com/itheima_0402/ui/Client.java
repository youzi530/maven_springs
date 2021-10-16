package com.itheima_0402.ui;

import com.itheima_0402.dao.IAccountDao;
import com.itheima_0402.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟表现层（用于调用业务层，实际上是一个servlet）
 */
public class Client {

    /**
     * 获取spring的IOC的核心容器，并根据id来获取对象
     * ApplicationContext
     * @param args
     */
    public static void main(String[] args) {
        //IAccountService as = new AccountServiceImpl();

        //1、获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("itheimabean.xml");
        //ApplicationContext ac = new FileSystemXmlApplicationContext("F:\\study\\java\\IdeaProjects\\maven_spring\\spring_02_Demo\\src\\main\\resources\\itheimabean.xml");

        //2、根据id获取Bean对象
        IAccountService as = (IAccountService) ac.getBean("accountService");
        IAccountDao adao = ac.getBean("accountDao", IAccountDao.class);

        System.out.println(as);
        System.out.println(adao);
        //as.saveAccount();


        //---------BeanFactory-----------
//        Resource resource = new ClassPathResource("itheimabean.xml");
//        BeanFactory factory = new XmlBeanFactory(resource);
//        IAccountService as = (IAccountService) factory.getBean("accountService");
    }

}
