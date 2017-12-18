package com.spring.aop;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import org.aspectj.lang.annotation.Pointcut;

public interface Caculator {
    int add(int i, int j);
    int sub(int i, int j);
    int multi(int i, int j);
    int div(int i, int j);
}
