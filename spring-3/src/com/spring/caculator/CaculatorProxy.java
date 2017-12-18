package com.spring.caculator;

import com.spring.aop.Caculator;
import com.spring.aop.CaculatorLoggingImple;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class CaculatorProxy implements InvocationHandler{
    private Object target;

    CaculatorProxy(Object target) {
        this.target = target;
    }

    public Caculator getCaculator(){
        System.out.println(Arrays.toString(target.getClass().getInterfaces()));
        Caculator caculator = (Caculator) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new CaculatorProxy(target));
        return caculator;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (proxy.getClass() == CaculatorLoggingImple.class){
            System.out.println( "--"+ method.getName()+ "=======before " + Arrays.toString(args));
        }
        Object result = null;
        try {
            //前置通知
            result = (int) method.invoke(target,args);
            //返回通知，可以访问到方法的返回值，发生异常则无法通知
        } catch (Exception e) {
            e.printStackTrace();
            //异常通知
        }
        //后置通知
        System.out.println(method.getName() + "=======after " + result);
        return result;
    }
}
