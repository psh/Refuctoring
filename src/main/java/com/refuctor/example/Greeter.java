package com.refuctor.example;

public class Greeter {

  private GetterGetter gg = new GetterGetter();

  public Getter hg = gg.createGetter(1);
  public Getter cg = gg.createGetter(2);
  public Getter sg = gg.createGetter(3);
  public Getter wg = gg.createGetter(4);
  public Getter eg = gg.createGetter(5);

  public String getGreeting() {
    return hg.getStr() + cg.getStr() + sg.getStr() + wg.getStr() + eg.getStr();
  }

}
