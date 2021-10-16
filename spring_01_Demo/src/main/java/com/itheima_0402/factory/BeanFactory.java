package com.itheima_0402.factory;


import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 一个创建bean对象的工厂
 */
public class BeanFactory {

    //定义个properties对象
    private static Properties props;

      //定义一个Map，用于存放我们创建的对象，我们把它称之为容器
    private static Map<String,Object> beans;

    //使用静态代码块为Properties对象赋值
    static{
        //实例化对象
        props = new Properties();

        //获取properties文件的流对象
        //InputStream in = new FileInputStream();  --不要用这个对象，有关于路径问题的干扰
        InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("hiemabean.properties");
        try {
            props.load(in);
            //实例化我们的容器
            beans = new HashMap<String, Object>();
            //取出配置文件中所有的key
            Enumeration<Object> keys = props.keys();
            //遍历这个枚举
            while(keys.hasMoreElements()){
                //取出每个key
                String key = keys.nextElement().toString();
                //根据key获取value
                String beanPath = props.getProperty(key);
                //反射创建对象
                Object value = Class.forName(beanPath).newInstance();
                //把key和value存入容器中
                beans.put(key,value);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExceptionInInitializerError("初始化properties失败！");
        }
    }

    /**
     * 根据bean名称获取bean对象
     * @param beanName
     * @return
     */
//    public static Object getBean(String beanName) {
//        Object bean = null;
//        String beanPath = props.getProperty(beanName);
//        try {
//            bean = Class.forName(beanPath).newInstance();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return bean;
//    }

    public static Object getBean(String beanName){
        return beans.get(beanName);
    }
}
