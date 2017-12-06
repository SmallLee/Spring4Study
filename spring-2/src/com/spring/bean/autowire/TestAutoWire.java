package com.spring.bean.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWire {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-autowire.xml");
        Person person7 = (Person) applicationContext.getBean("person7");
        System.out.println(person7);
    }
}
