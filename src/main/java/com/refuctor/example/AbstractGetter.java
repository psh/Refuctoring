package com.refuctor.example;

public abstract class AbstractGetter implements Getter {
    private String springProperty;

    @Override
    public abstract String getStr();

    public void setSpringProperty(String springProperty) {
        this.springProperty = springProperty;
    }

    public String getSpringProperty() {
        return springProperty;
    }
}
