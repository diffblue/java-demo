package com.diffblue.javademo;

// Copyright 2016-2017 DiffBlue limited. All rights reserved.

public class Search {
  /**
   * Checks if an integer is contained within an array.
   */
  public boolean contains(int [] array, int target) {
    boolean found = false;
    int i;

    for (i = 0; i < array.length; ++i) {
      if (array[i] == target) {
        found = true;
      }
    }

    return found;
  }
}
