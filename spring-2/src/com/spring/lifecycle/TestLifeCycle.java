package com.spring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycle {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans-lifecycle.xml");
        Car car = (Car) context.getBean("car2");
        //关闭IOC容器
        context.close();
    }
}
