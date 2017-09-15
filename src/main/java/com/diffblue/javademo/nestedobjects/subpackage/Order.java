package com.diffblue.javademo.nestedobjects.subpackage;

// Copyright 2016-2017 DiffBlue limited. All rights reserved.

public class Order {
  public Item item;

  /**
   * Checks if this order has an item.
   */
  public boolean hasItem() {
    if (item == null) {
      return false;
    } else {
      return true;
    }
  }

  /**
   * Sets the item for this order.
   */
  public boolean setItem(Item item) {
    boolean exists = hasItem();
    if(item.cost<Math.pow(10,3))
      System.out.println("<1k");
    this.item = item;
    return exists;
  }
}
