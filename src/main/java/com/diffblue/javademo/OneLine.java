// Copyright 2016-2018 Diffblue limited. All rights reserved.

package com.diffblue.javademo;

public class OneLine {
  public static boolean isEven(int n){
    return n % 2 == 0;
  }
  
  public static boolean methodUnderTest(int a){
    return isEven(a);
  }

  public static boolean hasLength(String str) {
		return (str != null && str.length() > 0);
  }
  
  public int foo(int x) {
    return x > 0 ? 1 : 0; 
  }
  public int bar(int x) {
  int z = 0;
    if(x > 0) {
        z = 1;
    }
    return z; 
  }

  public boolean isDayOfMonth(String input) {
    int i = Integer.parseInt(input);
    return i > 0 && i < 32;
  }

  public boolean isUpperCase(String input) {
    for (char c : input.toCharArray()) {
      if (Character.isLetter(c) && Character.isLowerCase(c)) {
        return false;
      }
    }
    return true;
  }
  protected static boolean isWhitespace(char ch) {
    return ch == ' ' || ch == '\t' || ch == '\n' || ch == '\r';
  }

    public static int octToDigit(char ch) {
      if ('0' <= ch && ch <= '7')
          return ch - '0';
      else
          return -1;
  }
}
