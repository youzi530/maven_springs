package com.itheima_0504.test;

import com.itheima_0501.damain.Account;
import com.itheima_0501.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 使用junit测试，测试我们的配置
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:itheimabean_0501.xml")

public class AccountServiceTest {

    @Autowired
    private ApplicationContext  ac = null;

    @Test
    public void testFindAll(){
        //1、获取容器
        //ApplicationContext  ac = new ClassPathXmlApplicationContext("itheimabean_0501.xml");
        //2、得到业务层对象
        IAccountService as = ac.getBean("accountService",IAccountService.class);
        //3、执行方法
        List<Account> accounts = as.findAllAccount();
        for (Account account :accounts){
            System.out.println(account);
        }
    }

    @Test
    public void testFindAccountById() {
        //1、获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("itheimabean_0501.xml");
        //2、得到业务层对象
        IAccountService as = ac.getBean("accountService", IAccountService.class);
        //3、执行方法
        Account account = as.findAccountById(1);
        System.out.println(account);
    }

    @Test
    public void testSaveAccount() {
        //1、获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("itheimabean_0501.xml");
        //2、得到业务层对象
        IAccountService as = ac.getBean("accountService", IAccountService.class);
        //3、执行方法
        Account account = new Account();
        account.setName("张三");
        account.setMoney(12345f);
        as.saveAccount(account);
    }

    @Test
    public void testUpdateAccount() {
        //1、获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("itheimabean_0501.xml");
        //2、得到业务层对象
        IAccountService as = ac.getBean("accountService", IAccountService.class);
        //3、执行方法
        Account account =as.findAccountById(3);
        account.setName("张三");
        account.setMoney(4321f);
        as.updateAccount(account);
    }

    @Test
    public void testDeleteAccount() {
        //1、获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("itheimabean_0501.xml");
        //2、得到业务层对象
        IAccountService as = ac.getBean("accountService", IAccountService.class);
        //3、执行方法
        as.deleteAccount(4);
    }
}
