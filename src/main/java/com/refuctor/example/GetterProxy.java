package com.refuctor.example;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GetterProxy implements InvocationHandler {
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Annotation[] annotations = o.getClass().getAnnotations();
        for (int i = 0; i < annotations.length; i++) {
            Annotation annotation = annotations[i];
            if (annotation instanceof GetterPart) {
                return ((GetterPart)annotation).value();
            }
        }

        annotations = method.getDeclaredAnnotations();
        for (int i = 0; i < annotations.length; i++) {
            Annotation annotation = annotations[i];
            if (annotation instanceof GetterPart) {
                return ((GetterPart)annotation).value();
            }
        }

        return null;
    }
}
