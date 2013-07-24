package com.refuctor.example;

public class Greeter {

  public Getter hg = new HGetter();
  public Getter cg = new CGetter();
  public Getter sg = new SGetter();
  public Getter wg = new WGetter();
  public Getter eg = new EGetter();

  public String getGreeting() {
    return hg.getStr() + cg.getStr() + sg.getStr() + wg.getStr() + eg.getStr();
  }

}
