package com.hc.entity;

public class User {

    public User(){
        System.out.println("无参构造函数");
    }

    public User(int num){
        System.out.println("有参构造函数"+num);
    }

    public void init(){
        System.out.println("初始化");
    }

    public void destory(){
        System.out.println("销毁");
    }


}
