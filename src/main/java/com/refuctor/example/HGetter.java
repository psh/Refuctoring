package com.refuctor.example;

public class HGetter extends AbstractGetter {

    @Override
    public String getStr() {
        return getSpringProperty();
    }

}
