package com.itheima_0601.service;

import com.itheima_0601.damain.Account;

import java.util.List;

/**
 * 账户的业务层接口
 */
public interface IAccountService {

    List<Account> findAllAccount();

    Account findAccountById(Integer accountId);

    void saveAccount(Account account);

    void updateAccount(Account account);

    void deleteAccount(Integer accountId);
}
