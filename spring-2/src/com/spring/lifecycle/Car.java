package com.spring.lifecycle;

public class Car {
    private String brand;

    public void setBrand(String brand) {
        System.out.println("set brand");
        this.brand = brand;
    }

    public Car(){
        System.out.println("Car constructor...");
    }

    public void init(){
        System.out.println("init.....");
    }
    public void destory(){
        System.out.println("destory.....");
    }
}
