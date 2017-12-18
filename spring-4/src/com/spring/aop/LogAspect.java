package com.spring.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
    @Before("execution(* com.spring.aop.CaculatorLoggingImple.*(..))")
    public void beforeMethod(){
        System.out.println("before method");
    }
    @After("execution(* com.spring.aop.CaculatorLoggingImple.*(..))")
    public void afterMethod(){
        System.out.println("after method");
    }
    @AfterReturning(value = "execution(* com.spring.aop.CaculatorLoggingImple.*(..))",returning = "result")
    public void afterReturnMethod(Object result){
        System.out.println("afterReturn method"+result);
    }
    @AfterThrowing(value = "execution(public int com.spring.aop.Caculator.*(..))",throwing = "exception")
    public void afterException(Exception exception){
        System.out.println(exception.getLocalizedMessage());
    }
}
