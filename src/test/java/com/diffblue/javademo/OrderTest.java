package com.diffblue.javademo;

// Copyright 2016-2017 DiffBlue limited. All rights reserved.

import com.diffblue.javademo.nestedobjects.subpackage.Order;
import com.diffblue.javademo.nestedobjects.subpackage.Item;
import com.diffblue.javademo.nestedobjects.User;
import org.junit.Assert;
import org.junit.Test;

public class OrderTest {
  @Test
  public void hasItem() {
    Order order = new Order();

    boolean result = order.hasItem();
    Assert.assertFalse(result);
  }

  @Test
  public void checkItemCost() {
    Order order = new Order();
    User user = new User(order);
    Item item = new Item();

    boolean result = user.checkItemCost(item);
    Assert.assertFalse(result);
  }

}
