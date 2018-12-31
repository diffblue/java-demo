package main.java.com.diffblue.javademo;

public class JMethods {

    // method defined
    private static int getSquare(int x){
        return x * x;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            // method call
            result = getSquare(i);
            System.out.println("Square of " + i + " is : " + result); }
    }
}