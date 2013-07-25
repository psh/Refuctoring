package com.refuctor.example;

public class Greeter {

    public String getGreeting() {
        GetterGetter gg = new GetterGetter();

        HGetter h = gg.createGetter(HGetter.class);
        CGetter c = gg.createGetter(CGetter.class);
        SGetter s = gg.createGetter(SGetter.class);
        WGetter w = gg.createGetter(WGetter.class);
        EGetter e = gg.createGetter(EGetter.class);

        return h.getStr() + c.getStr() + s.getStr() + w.getStr() + e.getStr();
    }

}
