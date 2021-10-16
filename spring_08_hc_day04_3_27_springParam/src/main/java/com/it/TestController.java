package com.it;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "/user") //一级目录
public class TestController {

    @RequestMapping(path = "/test.do",method = {RequestMethod.GET},params = {"username"}) //二级目录
    public String test(){
        System.out.println("hello!");
        //去调用service里面的方法
        return "suceess";
    }

}
