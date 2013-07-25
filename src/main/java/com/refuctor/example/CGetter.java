package com.refuctor.example;

public interface CGetter extends Getter {
    @Override
    @GetterPart(",")
    public String getStr();
}
