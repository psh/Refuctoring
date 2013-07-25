package com.refuctor.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GetterProxy implements InvocationHandler {
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        if (o instanceof HGetter) {
            return "Hello";
        } else if (o instanceof CGetter) {
            return ",";
        } else if (o instanceof SGetter) {
            return " ";
        } else if (o instanceof WGetter) {
            return "World";
        } else if (o instanceof EGetter) {
            return "!";
        }
        return null;
    }
}
