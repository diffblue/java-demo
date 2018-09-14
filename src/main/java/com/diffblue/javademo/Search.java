package com.diffblue.javademo;

import org.apache.commons.codec.digest.DigestUtils;

// Copyright 2016-2018 Diffblue limited. All rights reserved.

public class Search {
  /**
   * Checks if an integer is contained within an array.
   */
  public boolean contains(int [] array, int target) {
    boolean found = false;

    for (int count = 0; count < array.length; ++count) {
      if (array[count] == target) {
        found = true;
      }
    }

    return found;
  }

  /**
   * Check if the sha1 of the input matches an expected value.
   * @param input input string
   * @return boolean
   */
  public boolean isNeedleInHaystack(String input) {
    if ("3b6e258214f894ab41c9deaaeb38d1fd9aeca9c7"
         .equals(DigestUtils.sha1Hex(input))) {
      return true;
    }
    return false;
  }
}
