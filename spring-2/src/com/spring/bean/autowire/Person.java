package com.spring.bean.autowire;

public class Person {
    private Address address;
    private Car car;
    private String name;
    private int age;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(Address address, Car car, String name, int age) {
        this.address = address;
        this.car = car;
        this.name = name;
        this.age = age;
    }
    public Person(){}

    @Override
    public String toString() {
        return "Person{" +
                "address=" + address +
                ", car=" + car +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
