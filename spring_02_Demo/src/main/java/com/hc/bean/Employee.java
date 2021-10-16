package com.hc.bean;

public class Employee {

    String name;
    Car car;

    public void setName(String name) {
        this.name = name;
    }
    public void setCar(Car car) {
        this.car = car;
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + ", car=" + car + "]";
    }
}
