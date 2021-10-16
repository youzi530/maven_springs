package com.hc.bean;

public class Car {
    String name;
    Double price;

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Car [name=" + name + ", price=" + price + "]";
    }
}
