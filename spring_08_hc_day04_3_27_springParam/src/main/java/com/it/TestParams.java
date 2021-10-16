package com.it;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/param")
public class TestParams {

    //如果参数是基本类型
    @RequestMapping("/testParam.do")
    public String testParam(String username,int password){
        System.out.println("username="+username+",password="+password);
        return "suceess";
    }

}
