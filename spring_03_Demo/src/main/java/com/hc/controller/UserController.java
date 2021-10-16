package com.hc.controller;

import org.springframework.stereotype.Component;


//用于创建对象的注解
//@Component

@Component("user")
public class UserController {

    public void loginController(){
        System.out.println("User login success!!!");
    }
}
