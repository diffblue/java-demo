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
}
