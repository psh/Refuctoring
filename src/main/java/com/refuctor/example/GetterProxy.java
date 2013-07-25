package com.refuctor.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GetterProxy implements InvocationHandler {
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        GetterPart annotation = o.getClass().getAnnotation(GetterPart.class);
        return annotation.value();
    }
}
