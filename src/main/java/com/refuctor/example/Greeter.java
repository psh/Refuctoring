package com.refuctor.example;

public class Greeter {

    private GetterGetter gg = new GetterGetter();

    public Getter hg = gg.createGetter(HGetter.class);
    public Getter cg = gg.createGetter(CGetter.class);
    public Getter sg = gg.createGetter(SGetter.class);
    public Getter wg = gg.createGetter(WGetter.class);
    public Getter eg = gg.createGetter(EGetter.class);

    public String getGreeting() {
        return hg.getStr() + cg.getStr() + sg.getStr() + wg.getStr() + eg.getStr();
    }

}
