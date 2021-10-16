package service.impl;


import dao.IAccountDao;
import dao.impl.AccountDaoImpl;
import service.IAccountService;

public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao = new AccountDaoImpl();

    public void saveAccount() {
        accountDao.saveAccount();
    }
}
