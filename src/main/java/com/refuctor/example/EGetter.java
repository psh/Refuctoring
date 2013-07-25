package com.refuctor.example;

public interface EGetter extends Getter {
    @Override
    @GetterPart("!")
    public String getStr();
}