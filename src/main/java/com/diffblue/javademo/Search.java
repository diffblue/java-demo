package com.diffblue.javademo;

import org.apache.commons.codec.digest.DigestUtils;

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

  public boolean isNeedleInHaystack(String s)
  {
    if("3b6e258214f894ab41c9deaaeb38d1fd9aeca9c7"
         .equals(DigestUtils.sha1Hex(s)))
    {
      return true;
    }
    return false;
  }
}
