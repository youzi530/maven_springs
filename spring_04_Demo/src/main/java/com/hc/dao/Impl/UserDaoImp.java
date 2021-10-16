package com.hc.dao.Impl;

import com.hc.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImp implements UserDao {

    public void findUser() {
        System.out.println("UserDao");
    }
}
