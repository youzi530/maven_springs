package com.hc.test;

import com.hc.bean.Employee;
import com.hc.entity.User;
import com.hc.entity.User2;
import com.hc.entity.User3;
import com.hc.entity.User4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        //一、获取目的对象的实例对象的三个方法

        //1、默认调用无参构造方法：(推荐使用)
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        //User user = (User) applicationContext.getBean("user");
        //System.out.println(user);

        //2、如果是有参构造函数的话：方法一:写一个静态方法
        // 我自己在bean.xml写一个<bean id="staticUser" class="com.hc.factory.StaticFactory" factory-method="getUser"></bean>
        //ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("bean.xml");
        //User user1 = (User) applicationContext1.getBean("staticUser");
        //System.out.println(user1);

        //3、如果是有参构造函数的话：方法二:非静态方法
        //我加一个类InstanceFactory，里面有一个非静态方法public User getUser(){ return new User(2); }
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        //User user = (User) applicationContext.getBean("user1");
        //System.out.println(user);


        //二、使用范围：单例(singleton)还是多例(prototype)，默认单例
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        //User user = (User) applicationContext.getBean("user2");
        //System.out.println(user);
        //User user2 = (User) applicationContext.getBean("user2");
        //System.out.println(user2);

        //三、 生命周期
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        //User user = (User) applicationContext.getBean("user3");
        //System.out.println(user);

        //((ClassPathXmlApplicationContext)applicationContext).close();


        //四、DI：依赖注入方式一
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        //User2 user = (User2) applicationContext.getBean("user4");
        //System.out.println(user);

        //四、DI：依赖注入方式二
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        //User3 user = (User3) applicationContext.getBean("user5");
        //System.out.println(user);

        //五、复杂数据注入
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        //User4 user = (User4) applicationContext.getBean("user6");
        //System.out.println(user);

        // 六、命名空间的注入
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        //User2 user = (User2) applicationContext.getBean("user7");
        //System.out.println(user);

        //七、 spEL的属性注入
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Employee employee = (Employee) applicationContext.getBean("employee");
        System.out.println(employee);

    }


}
