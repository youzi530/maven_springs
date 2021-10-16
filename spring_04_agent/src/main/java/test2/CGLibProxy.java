package test2;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLibProxy implements MethodInterceptor {
    //目标类
    private ProductDao productDao;

    public CGLibProxy(ProductDao productDao) {
        this.productDao = productDao;
    }

    public ProductDao getProxy() {
        // 使用CGLIB生成代理:
        // 1.创建核心类:
        Enhancer enhancer = new Enhancer();
        // 2.为其设置父类:
        enhancer.setSuperclass(productDao.getClass());
        // 3.设置回调:和JDK动态代理的invoke()方法类同
        enhancer.setCallback(this);
        // 4.创建代理:
        return (ProductDao) enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if ("add".equals(method.getName())) {
            System.out.println("日志记录==============");
            Object obj = methodProxy.invokeSuper(o, objects);//执行目标方法
            return obj;
        }
        return methodProxy.invokeSuper(o, objects);//执行目标方法
    }
}
