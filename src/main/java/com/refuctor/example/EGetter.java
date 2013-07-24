package com.refuctor.example;

public class EGetter extends AbstractGetter {

    @Override
    public String getStr() {
        return getSpringProperty();
    }

}
