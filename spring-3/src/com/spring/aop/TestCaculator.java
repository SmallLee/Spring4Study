package com.spring.aop;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCaculator {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Caculator caculator = context.getBean(Caculator.class);
        int addResult = caculator.add(2, 3);
        int mulResult = caculator.multi(3,4);
        System.out.println(addResult+"--"+mulResult);
    }
}
