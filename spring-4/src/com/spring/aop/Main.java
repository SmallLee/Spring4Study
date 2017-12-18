package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Caculator caculator = (Caculator) context.getBean("caim");
        System.out.println(caculator.getClass());
        int result = caculator.div(1000,0);
//        System.out.println(result);
    }
}
