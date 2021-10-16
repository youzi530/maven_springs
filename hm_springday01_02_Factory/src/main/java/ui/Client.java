package ui;

import factory.BeanFactory;
import service.IAccountService;
import service.impl.AccountServiceImpl;

/**
 * 模拟表现层（用于调用业务层，实际上是一个servlet）
 */
public class Client {

    public static void main(String[] args) {
        //IAccountService as = new AccountServiceImpl();

        for (int i = 0; i < 5; i++) {
            IAccountService as = (IAccountService) BeanFactory.getBean("accountService");
            System.out.println(as);
            as.saveAccount();
        }
    }

}
