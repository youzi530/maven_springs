package ui;
import dao.IAccountDao;
import dao.impl.AccountDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.IAccountService;

/**
 * 获取spring的核心容器，并根据id获取对象
 */
public class Client {

    public static void main(String[] args) {
        //1、获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2、根据id获取bean对象
        IAccountService as = (IAccountService) ac.getBean("accountServiceImpl");
        System.out.println(as);
        as.saveAccount();

        IAccountDao ad = (IAccountDao) ac.getBean("accountDao1");
        System.out.println(ad);

    }

}
