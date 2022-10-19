package com.diffblue.javademo;

//import java.util.ArrayList;

public class Primes {

    /**
     * Totally Crap algorithm based on https://www.codespeedy.com/find-the-nth-prime-number-in-java/
     *
     * @param n Ordinal of prime to return, 1st prime returns 2
     * @return A prime number
     */
    public static int calcNthPrime(int n) {
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

    public static int getNthPrime() {
        return getNthPrime(100);
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
//
//    public int memberMethod(int a) {
//        throw new NullPointerException();
////        return a + 1;
//    }
//
//    public void pants() {}
//
//    private int privateMethod(int a) {
//        return a + 2;
//    }
//
//    public class PrimeGenerator {
//        private int[] primes;
//        private ArrayList<Integer> multiplesOfPrimeFactors;
//
//        protected int[] generate(int n) {
//            primes = new int[n];
//            multiplesOfPrimeFactors = new ArrayList<Integer>();
//            set2AsFirstPrime();
//            checkOddNumbersForSubsequentPrimes();
//            return primes;
//        }
//
//        private void set2AsFirstPrime() {
//            primes[0] = 2;
//            multiplesOfPrimeFactors.add(2);
//        }
//
//        private void checkOddNumbersForSubsequentPrimes() {
//            int primeIndex = 1;
//            for (int candidate = 3;
//                 primeIndex < primes.length;
//                 candidate += 2) {
//                if (isPrime(candidate))
//                    primes[primeIndex++] = candidate;
//            }
//        }
//
//        private boolean isPrime(int candidate) {
//            if (isLeastRelevantMultipleOfNextLargerPrimeFactor(candidate)) {
//                multiplesOfPrimeFactors.add(candidate);
//                return false;
//            }
//            return isNotMultipleOfAnyPreviousPrimeFactor(candidate);
//        }
//
//        private boolean
//        isLeastRelevantMultipleOfNextLargerPrimeFactor(int candidate) {
//            int nextLargerPrimeFactor = primes[multiplesOfPrimeFactors.size()];
//            int leastRelevantMultiple = nextLargerPrimeFactor * nextLargerPrimeFactor;
//            return candidate == leastRelevantMultiple;
//        }
//
//        private boolean
//        isNotMultipleOfAnyPreviousPrimeFactor(int candidate) {
//            for (int n = 1; n < multiplesOfPrimeFactors.size(); n++) {
//                if (isMultipleOfNthPrimeFactor(candidate, n))
//                    return false;
//            }
//            return true;
//        }
//
//        private boolean
//        isMultipleOfNthPrimeFactor(int candidate, int n) {
//            return
//                    candidate == smallestOddNthMultipleNotLessThanCandidate(candidate, n);
//        }
//
//        private int
//        smallestOddNthMultipleNotLessThanCandidate(int candidate, int n) {
//            int multiple = multiplesOfPrimeFactors.get(n);
//            while (multiple < candidate)
//                multiple += 2 * primes[n];
//            multiplesOfPrimeFactors.set(n, multiple);
//            return multiple;
//        }
//    }
}