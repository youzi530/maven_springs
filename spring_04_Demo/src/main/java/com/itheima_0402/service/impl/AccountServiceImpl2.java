package com.itheima_0402.service.impl;

import com.itheima_0402.service.IAccountService;

import java.util.Date;

public class AccountServiceImpl2 implements IAccountService {

    //如果是经常变化的数据，并不适用于注入的方式
    private String name;
    private Integer age;
    private Date birthday;

    public void setName(String name) {
        this.name = name;
    }

//    public void setUsername(String name) {
//        this.name = name;
//    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void saveAccount() {
        System.out.println("service中的saveAccount方法执行了！！！");
        System.out.println(name+","+age+","+birthday);
    }
}
