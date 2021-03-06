package com.bean.anotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private UserService service;
    @Autowired(required = false)
    private TestObject testObject;
    public void execute(){
        System.out.println("UserController execute...");
        service.add();
    }
}
