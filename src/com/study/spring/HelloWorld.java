package com.study.spring;

public class HelloWorld {

    private String name;

    public void setName(String name) {
        System.out.println(name);
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello: " + name);
    }
    public HelloWorld(){
        System.out.println("helloworld constructor");
    }
}
