package ui;
import dao.IAccountDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.IAccountService;
import service.impl.AccountServiceImpl;

/**
 * 获取spring的核心容器，并根据id获取对象
 */
public class Client {

    public static void main(String[] args) {
        //1、获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2、根据id获取bean对象
        IAccountService as = (IAccountService) ac.getBean("accountService");
        IAccountDao as1 = ac.getBean("accountDao", IAccountDao.class);
        System.out.println(as);
        System.out.println(as1);
    }

}
