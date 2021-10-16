package com.hc.bean;

public class CarInfo {

    String name="奔驰";

    public String getName() {
        return this.name;
    }
    public Double calculatePrice() {
        return Math.random()*3000;
    }
}
