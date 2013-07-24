package com.refuctor.example;

public class WGetter extends AbstractGetter {

    @Override
    public String getStr() {
        return getSpringProperty();
    }

}
