import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.IAccountService;

/**
 * 测试aop配置
 */
public class AopTest {
    public static void main(String[] args) {
        //1、获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2、获取对象
        IAccountService as = (IAccountService) ac.getBean("accountService");
        //3、执行方法
        as.saveAccount();

    }
}
