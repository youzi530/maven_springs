package com.hc.controller;

import com.hc.service.UserService;
import com.hc.service.UserService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UserController1 {

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


    public void loginController(){
        System.out.println("User login success!!!"+username+"密码（public）："+password+"密码2（private）："+password2);
        userService1.login();
    }
}
