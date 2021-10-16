package service.impl;


import dao.IAccountDao;
import dao.impl.AccountDaoImpl;
import factory.BeanFactory;
import service.IAccountService;

public class AccountServiceImpl implements IAccountService {

    //private IAccountDao accountDao = new AccountDaoImpl();
    private IAccountDao accountDao = (IAccountDao) BeanFactory.getBean("accountDao");

    //private int i = 1;

    public void saveAccount() {
        int i= 1;
        accountDao.saveAccount();
        System.out.println(i);
        i++;
    }
}
