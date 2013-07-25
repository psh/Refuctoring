package com.refuctor.example;

public interface WGetter extends Getter {
    @Override
    @GetterPart("World")
    public String getStr();
}