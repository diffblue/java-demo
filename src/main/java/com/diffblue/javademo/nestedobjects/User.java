package com.diffblue.javademo.nestedobjects;

// Copyright 2016-2017 DiffBlue limited. All rights reserved.

import com.diffblue.javademo.nestedobjects.subpackage.Item;
import com.diffblue.javademo.nestedobjects.subpackage.Order;

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
  /**
   * Checks if an item name the same as the user's order item.
   */
  public boolean checkItemName(Item item) {
    if (!order.hasItem()) {
      return false;
    }
    return order.item.name == item.name;
  }


  private Order order;

  public User setOrder(Order newOrder) {
    order = newOrder;
    return this;
  }

  public Order getOrder() {
    return order;
  }
}
