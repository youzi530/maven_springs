package com.hc.entity;

import java.util.*;

public class User4 {

    private String[] array;
    private List<String> list;
    private Set<String> set;
    private Map<String,String>map;
    private Properties properties;
    private List<User3> listUser3;
    private Map<String,User3>mapUser3;

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public List<User3> getListUser3() {
        return listUser3;
    }

    public void setListUser3(List<User3> listUser3) {
        this.listUser3 = listUser3;
    }

    public Map<String, User3> getMapUser3() {
        return mapUser3;
    }

    public void setMapUser3(Map<String, User3> mapUser3) {
        this.mapUser3 = mapUser3;
    }

    @Override
    public String toString() {
        return "User4{" +
                "array=" + Arrays.toString(array) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                ", listUser3=" + listUser3 +
                ", mapUser3=" + mapUser3 +
                '}';
    }
}
