package com.hc.controller;

import com.hc.service.UserService1;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.sql.Connection;
import java.util.Date;

//@Controller
public class UserController3 {

    //方法1：
    //@Autowired()
    //@Qualifier("userServiceImp1")

    //方法2：
    @Resource(name = "userServiceImp1")
    UserService1 userService1;

    //普通数据类型
    @Value("张三")
    String username;

    @Value("#{userServiceImp1.servicesPassword}")
    String password;

    @Value("#{userServiceImp1.servicesPassword2}")
    String password2;

    //第三方的实体类数据
    @Resource(name = "myage")
    Date age;

    @Resource(name = "mybirthday")
    String birthday;

    @Resource(name = "myconn")
    Connection connection;


//    @PostConstruct
//    public void init(){
//        System.out.println("init");
//    }
//
//    @PreDestroy
//    public void destory(){
//        System.out.println("destory");
//    }


    public void loginController(){
        System.out.println("User login success!!!"+username+",密码（public）："+password+",密码2（private）："+password2+",age"+age);
        System.out.println("生日："+birthday);
        System.out.println("连接："+connection);
        userService1.login();
    }
}
