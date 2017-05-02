package com.diffblue.javatest.nestedobjects;

//Copyright 2016-2017 DiffBlue limited. All rights reserved.

import com.diffblue.javatest.nestedobjects.subpackage.Item;
import com.diffblue.javatest.nestedobjects.subpackage.Order;

public class User {
  public User(Order order)  {
    this.order = order;
  }

  /**
   * Checks if an item costs the same as the user's order item.
   */
  public boolean checkItemCost(Item item) {
    if (!order.hasItem()) {
      return false;
    }
    return order.item.cost == item.cost;
  }

  private Order order;
}
