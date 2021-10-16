package test3_AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("user");
        userDao.add();
        userDao.delete();
        userDao.select();
        userDao.update();
    }
}
