package com.hc.bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

//用Bean工厂来实现组件,Bean:可重用组件
public class BeanFactory {

    private static Properties properties;

    //改成单例模式，建立一个容器
    private static Map<String ,Object> container;

    //通过读取配置文件来获取类的全路径
    static{
        properties = new Properties();

        //读取资源的方式来获取文件
        //通过类加载器来读取本项目相对资源
        InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        container = new HashMap<String, Object>();
        try {
            properties.load(in);

            //遍历配置文件
            Enumeration<Object> keys = properties.keys();
            while (keys.hasMoreElements()){
                String key = keys.nextElement().toString();
                String beanPath = properties.getProperty(key);
                Object object = Class.forName(beanPath).newInstance();
                container.put(key,object);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Object getBean(String beanName) throws Exception {

        //单例模式：
        //String beanPath = properties.getProperty(beanName);
        //Object object = Class.forName(beanPath).newInstance();
        //return object;


        //多例模式：（新建一个容器来装）
        Object o = container.get(beanName);
        return o;


    }
}
