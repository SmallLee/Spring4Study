package com.spring.bean.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class TestRelation {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-relation.xml");
//        Address address1 = (Address) applicationContext.getBean("address1");
//        Address address2 = (Address) applicationContext.getBean("address2");
//        System.out.println(address1);
//        System.out.println(address2);

        DataSource dataSource = (DataSource) applicationContext.getBean("datasource");
        System.out.println(dataSource);
    }
}
