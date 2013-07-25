package com.refuctor.example;

import java.lang.reflect.Proxy;

public class GetterGetter {

    public <T> T createGetter(Class<T> getterClass) {
        return (T) Proxy.newProxyInstance(
                Getter.class.getClassLoader(),
                new Class[]{getterClass},
                new GetterProxy());
    }

}
