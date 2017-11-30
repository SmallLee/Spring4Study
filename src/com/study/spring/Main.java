package com.study.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        HelloWorld helloWorld = new HelloWorld();
//        helloWorld.setName("Spring");

        //1.创建Spring的IOC容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.从容器中获取Bean实例，根据id
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorld");
        //根据bean的class从IOC容器中获取实例
//        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean(HelloWorld.class);
        helloWorld.sayHello();
        Car car = (Car) applicationContext.getBean("car");
        System.out.println(car);
        car = (Car) applicationContext.getBean("car3");
        System.out.println(car);
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }
}
