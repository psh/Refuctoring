package com.refuctor.example;

public interface HGetter extends Getter {
    @Override
    @GetterPart("Hello")
    public String getStr();
}
