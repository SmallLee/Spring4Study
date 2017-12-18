package com.spring.caculator;

import com.spring.aop.Caculator;
import com.spring.aop.CaculatorLoggingImple;

public class Main {
    public static void main(String[] args) {
        CaculatorProxy caculatorProxy = new CaculatorProxy(new CaculatorLoggingImple());
        Caculator caculator = caculatorProxy.getCaculator();
        caculator.add(1,2);
        caculator.sub(4,1);
    }
}
