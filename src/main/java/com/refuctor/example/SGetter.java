package com.refuctor.example;

public class SGetter extends AbstractGetter {

    @Override
    public String getStr() {
        return getSpringProperty();
    }

}
