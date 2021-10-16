package com.hc.service.impl;

import com.hc.service.UserService1;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp1 implements UserService1 {

    @Value("adadahlfa")
    public String servicesPassword;

    //下面是private的话，就需要getter方法
    @Value("4141242")
    private String servicesPassword2;
    public String getServicesPassword2() {
        return servicesPassword2;
    }



    public void login() {
        System.out.println("312");
    }
}
