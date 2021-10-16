package service.impl;
import dao.IAccountDao;
import domain.Account;
import service.IAccountService;
import utils.TransactionManager;

import java.util.List;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl_OLD implements IAccountService {

    private IAccountDao accountDao;
    private TransactionManager tsManager;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setTsManager(TransactionManager tsManager) {
        this.tsManager = tsManager;
    }

    public List<Account> findAllAccount() {
        //1、开启事务
        //2、执行操作
        //3、提交事务
        //4、返回结果
        //5、在catch里面回滚事务
        //6、在finally里面释放连接
        try {
            //1.开启事务
            tsManager.beginTransaction();
            //2.执行操作
            List<Account> accounts = accountDao.findAllAccount();
            //3.提交事务
            tsManager.commit();
            //4.返回结果
            return accounts;
        }catch (Exception e){
            //5.回滚操作
            tsManager.rollback();
            throw new RuntimeException(e);
        }finally {
            //6.释放连接
            tsManager.release();
        }
    }

    public Account findAccountById(Integer accountId) {
        try {
            //1.开启事务
            tsManager.beginTransaction();
            //2.执行操作
            Account account = accountDao.findAccountById(accountId);
            //3.提交事务
            tsManager.commit();
            //4.返回结果
            return account;
        }catch (Exception e){
            //5.回滚操作
            tsManager.rollback();
            throw new RuntimeException(e);
        }finally {
            //6.释放连接
            tsManager.release();
        }

    }

    public void saveAccount(Account account) {
        try {
            //1.开启事务
            tsManager.beginTransaction();
            //2.执行操作
            accountDao.saveAccount(account);
            //3.提交事务
            tsManager.commit();
            //4.返回结果
        }catch (Exception e){
            //5.回滚操作
            tsManager.rollback();
            throw new RuntimeException(e);
        }finally {
            //6.释放连接
            tsManager.release();
        }
    }

    public void updateAccount(Account account) {
        try {
            //1.开启事务
            tsManager.beginTransaction();
            //2.执行操作
            accountDao.updateAccount(account);
            //3.提交事务
            tsManager.commit();
            //4.返回结果
        }catch (Exception e){
            //5.回滚操作
            tsManager.rollback();
            throw new RuntimeException(e);
        }finally {
            //6.释放连接
            tsManager.release();
        }
    }

    public void deleteAccount(Integer acccountId) {
        try {
            //1.开启事务
            tsManager.beginTransaction();
            //2.执行操作
            accountDao.deleteAccount(acccountId);
            //3.提交事务
            tsManager.commit();
            //4.返回结果
        }catch (Exception e){
            //5.回滚操作
            tsManager.rollback();
            throw new RuntimeException(e);
        }finally {
            //6.释放连接
            tsManager.release();
        }
    }

    public void transfer(String sourceName, String targetName, Float money) {
        try {
            //1.开启事务
            tsManager.beginTransaction();
            //2.执行操作
            //2.1、根据名称查询转出账户
            Account source = accountDao.findAccountByName(sourceName);
            //2.2、根据名称查询转入账户
            Account target = accountDao.findAccountByName(targetName);
            //2.3、转出账户减钱
            source.setMoney(source.getMoney() - money);
            //2.4、转入账户加钱
            target.setMoney(source.getMoney() + money);
            //2.5、更新转出账户
            accountDao.updateAccount(source);

            //int i = 1/0;

            //2.6、更新转入账户
            accountDao.updateAccount(target);
            //3.提交事务
            tsManager.commit();
            //4.返回结果
        }catch (Exception e){
            //5.回滚操作
            tsManager.rollback();
            throw new RuntimeException(e);
        }finally {
            //6.释放连接
            tsManager.release();
        }
    }
}
