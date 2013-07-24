package com.refuctor.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Greeter {

  private GetterGetter gg = new GetterGetter();

  public Getter hg = gg.createGetter(1);
  public Getter cg = gg.createGetter(2);
  public Getter sg = gg.createGetter(3);
  public Getter wg = gg.createGetter(4);
  public Getter eg = gg.createGetter(5);

  public String getGreeting() {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");

    return hg.getStr() + cg.getStr() + sg.getStr() + wg.getStr() + eg.getStr();
  }

}
