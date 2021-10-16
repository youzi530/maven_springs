package com.hc.factory;

import com.hc.entity.User;

public class InstanceFactory {

    public User getUser(){ return new User(2); }
}
