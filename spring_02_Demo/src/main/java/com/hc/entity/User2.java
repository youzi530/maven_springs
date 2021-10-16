package com.hc.entity;

import java.util.Date;

public class User2 {

    private Integer id;
    private String username;
    private String password;
    private String name;
    private Date birthday;

    public User2(Integer id, String username, String password, String name, Date birthday) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User2{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
