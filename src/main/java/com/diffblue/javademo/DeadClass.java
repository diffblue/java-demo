package com.diffblue.javademo;

public class DeadClass {
  int number;

  public DeadClass() {

  }

  public void setNumber(int number) {
    this.number = number;
  }

  public int getNumber() {
    return number;
  }

  public int isItNumber2(DeadClass dead) {
    dead.setNumber(1);
    if (dead.getNumber() == 2) {
      return 2;
    }
    return number;
  }
}
