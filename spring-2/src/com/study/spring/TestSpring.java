package com.study.spring;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) context.getBean("mapBean");
//        System.out.println(person);
        DataSource dataSource = (DataSource) context.getBean("dataSource");
        System.out.println(dataSource);

        Person person1 = (Person) context.getBean("person6");
        System.out.println(person1);
    }
}
