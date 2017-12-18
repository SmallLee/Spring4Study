package com.bean.factory;

public class Car {
    private String brand;
    private double price;
    private String address;
    private int maxspeed;

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
    public Car(double price, String address) {
        this.price = price;
        this.address = address;
    }

    public Car(String brand, int maxspeed) {
        this.brand = brand;
        this.maxspeed = maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }



    public void setPrice(double price) {
        this.price = price;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", address='" + address + '\'' +
                ", maxspeed=" + maxspeed +
                '}';
    }
}
