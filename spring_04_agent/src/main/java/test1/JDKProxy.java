package test1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//reflect：用JDK动态代理
//方式一：
public class JDKProxy implements InvocationHandler {//InvocationHandler相当于Company
    private UserDao userDao;

    public JDKProxy(UserDao userDao) {//传递的目标类对象
        this.userDao = userDao;
    }

    //通过动态代理，获取代理对象
    public UserDao getProxy() {//代理的类对象
        //参数：类加载器，实现的接口，
        ClassLoader classLoader = userDao.getClass().getClassLoader();
        Class<?>[] classes = userDao.getClass().getInterfaces();
        //* Proxy.newProxyInstance(三个参数)
        //* 参数含义：
        //* ClassLoader：和被代理对象使用相同的类加载器。
        //* Interfaces：和被代理对象具有相同的行为。实现相同的接口。
        //* InvocationHandler：如何代理。
        UserDao proxy = (UserDao) Proxy.newProxyInstance(classLoader, classes, this);
        return proxy;
    }

    //增强功能
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //根据自己的业务逻辑来进行增强
        if ("add".equals(method.getName())) {
            //记录日志，增强需求
            System.out.println("记录日志----------");
            Object result = method.invoke(userDao, args);//执行目标方法
            return result;
        }
        return method.invoke(userDao, args);//直接执行目标方法
    }
}
