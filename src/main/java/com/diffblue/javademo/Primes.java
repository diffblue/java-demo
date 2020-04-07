package com.diffblue.javademo;

public class Primes {


//  private Primes() {}

  /**
   * Totally rubbish algorithm based on https://www.codespeedy.com/find-the-nth-prime-number-in-java/
   *
   * @param n Ordinal of prime to return, 1st prime returns 2
   * @return A prime number
   */
  public static int getNthPrime(int n) {
    int num = 1;
    int count = 0;
    int i;
    while (count < n) {
      num = num + 1;
      for (i = 2; i <= num; i++) {
        if (num % i == 0) {
          break;
        }
      }
      if (i == num) {
        count = count + 1;
      }
    }
    return num;
  }

  public static int getThousandthPrime() {
    return getNthPrime(1000);
  }

  public static int getTenThousandthPrime() {
    return getNthPrime(10_000);
  }

  public static int getHundredThousandthPrime() {
    return getNthPrime(100_000);
  }

  public static int getMillionthPrime() {
    return getNthPrime(1000_000);
  }

  public int memberMethod(int a) {
    return a + 1;
  }

  private int privateMethod(int a) {
    return a + 2;
  }

}
