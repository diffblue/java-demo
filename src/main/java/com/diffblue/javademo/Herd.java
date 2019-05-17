package com.diffblue.javademo;

public class Herd {
  private Sheep a, b, c;
  public Herd(Sheep a, Sheep b, Sheep c) {
    this.a = a; this.b = b; this.c = c;
  }
  public boolean isGood() {
    if (a.getLegs() != 4 || b.getLegs() != 4 || c.getLegs() != 4) {
      return false;
    }
    return true;
  }
}
