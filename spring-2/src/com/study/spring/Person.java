package com.study.spring;

import java.util.List;
import java.util.Map;

public class Person {
    private String name;
    private int age;
    private List<Car> cars;
    private Map<String,Car> mapCars;

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

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public void setMapCars(Map<String,Car> mapCars) {
        System.out.println(mapCars);
        this.mapCars = mapCars;
    }

    public Person(String name, int age, List<Car> cars) {
        this.name = name;
        this.age = age;
        this.cars = cars;
    }

    public Person(String name, int age, Map<String,Car> mapCars) {
        this.name = name;
        this.age = age;
        this.mapCars = mapCars;
    }

    public Person() {

    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cars=" + cars + mapCars+
                '}';
    }
}
