package com.hc.factory;

import com.hc.entity.User;

public class StaticFactory {

    public static User getUser(){
        return new User();
    }
}
