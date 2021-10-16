package com.itheima_0601.test;
import com.itheima_0601.config.SpringConfiguration;
import com.itheima_0601.damain.Account;
import com.itheima_0601.service.IAccountService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;

/**
 * 使用junit测试，测试我们的配置
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class AccountServiceTest {

//方法一：
//    private ApplicationContext ac;
//    private IAccountService as;

//    @Before
//    public void init(){
//        ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//        as = ac.getBean("accountService",IAccountService.class);
//    }

//方法二： spring整合junit的配置 -------推荐使用
//    1、导入spring整合junit的jar坐标--spring-test
//    2、使用junit提供的注解把原有的main方法替换，替换成spring提供的
//          @RunWith(SpringJUnit4ClassRunner.class)
//    3、告知spring的运行器，spring的ioc创建时基于xml还是注解的，并且说明位置
//            @ContextConfiguration()
//                location:指定xml文件的位置，加上classpath关键字，表示在类路径下
//                classes：指定注解类所在位置
//    当我们使用spring 5版本的时候，要求junit的jar必须是4.12及以上

//方法错误展示：
//    @Autowired
//    private ApplicationContext ac =null;
//    解释：
//    1、应用程序的入口：main方法
//    2、junit单元测试中，没有main方法也能执行
//        junit集成了一个main方法
//            该方法就会判断当前测试类中哪些方法有 @Test注解
//            junit就让有Test注解的方法执行
//    3、junit不会管我们是否采用spring框架
//           在执行测试方法的时候，junit根本不知道我们是不是是用来了spring框架
//           所以也就不会为我们读取配置文件/配置类创建spring核心容器
//    4、当测试方法执行时，没有ioc容器，就算写了AutoWired注解，也无法实现


    @Autowired
    private IAccountService as =null;

    @Test
    public void testFindAll(){
//        //1、获取容器
//        //ApplicationContext  ac = new ClassPathXmlApplicationContext("itheimabean_0601.xml");
//        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//        //2、得到业务层对象
//        IAccountService as = ac.getBean("accountService",IAccountService.class);
//        //3、执行方法
        List<Account> accounts = as.findAllAccount();
        for (Account account :accounts){
            System.out.println(account);
        }
    }

    @Test
    public void testFindAccountById() {
        //1、获取容器
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        //2、得到业务层对象
        IAccountService as = ac.getBean("accountService", IAccountService.class);
        //3、执行方法
        Account account = as.findAccountById(1);
        System.out.println(account);
    }

    @Test
    public void testSaveAccount() {
        //1、获取容器
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
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
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
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
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        //2、得到业务层对象
        IAccountService as = ac.getBean("accountService", IAccountService.class);
        //3、执行方法
        as.deleteAccount(4);
    }
}
