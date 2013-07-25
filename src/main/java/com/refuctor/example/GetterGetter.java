package com.refuctor.example;

import java.lang.reflect.Proxy;

public class GetterGetter {
    public Getter createGetter(Class<? extends Getter> getterClass) {
        return (Getter) Proxy.newProxyInstance(
                Getter.class.getClassLoader(),
                new Class[]{getterClass},
                new GetterProxy());
    }

}
