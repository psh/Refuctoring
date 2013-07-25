package com.refuctor.example;

public interface SGetter extends Getter {
    @Override
    @GetterPart(" ")
    public String getStr();
}