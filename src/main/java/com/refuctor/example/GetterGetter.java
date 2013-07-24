package com.refuctor.example;

public class GetterGetter {
  public Getter createGetter(int i) {
    switch(i) {
      case 1: return new HGetter();
      case 2: return new CGetter();
      case 3: return new SGetter();
      case 4: return new WGetter();
      case 5: return new EGetter();
    }
    return null;
  }
}
