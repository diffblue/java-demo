package com.diffblue.javademo;

import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;

public class PrimesTest {

  @Test
  public void testGetThousandthPrime() {
    assertEquals(7919, Primes.getThousandthPrime());
  }

  @Test
  public void testGetTenThousandthPrime() {
    assertEquals(104729, Primes.getTenThousandthPrime());
  }
}
