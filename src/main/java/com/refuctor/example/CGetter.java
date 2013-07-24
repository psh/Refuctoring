package com.refuctor.example;

public class CGetter extends AbstractGetter {

    @Override
    public String getStr() {
        return getSpringProperty();
    }

}

