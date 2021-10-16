package com.hc.test;

import com.hc.service.Impl.IUserServiceImp;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.cglib.proxy.Factory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("bean.xml");

        //旧版本的BeanFactory
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        IUserServiceImp iUserServiceImp = (IUserServiceImp) beanFactory.getBean("iUserServiceImp");
        iUserServiceImp.findUser();
    }

    //新旧版本的区别：


}
