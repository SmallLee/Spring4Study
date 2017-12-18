package com.bean.anotation;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-annotation.xml");
        TestObject to = (TestObject) applicationContext.getBean("testObject");
        System.out.println(to);
        UserController  uc = (UserController) applicationContext.getBean("userController");
        uc.execute();
        UserRepositoryImpl uri = (UserRepositoryImpl) applicationContext.getBean("userRepositoryImpl");
        System.out.println(uri);
        UserService us = (UserService) applicationContext.getBean("userService");
        System.out.println(us);
    }

}
