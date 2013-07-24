package com.refuctor.example;

public class Greeter {

  public HGetter hg = new HGetter();
  public CGetter cg = new CGetter();
  public SGetter sg = new SGetter();
  public WGetter wg = new WGetter();
  public EGetter eg = new EGetter();

  public String getGreeting() {
    return hg.getHlo() + cg.getCma() + sg.getSpc() + wg.getWd() + eg.getEm();
  }

}
