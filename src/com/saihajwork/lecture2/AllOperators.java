package com.saihajwork.lecture2;

public class AllOperators {
    public static void main(String[] args) {
        int a = 20;
        int b = 5;
        System.out.println("Sum is: " + (a + b));
        System.out.println("Difference is: " + (a - b));
        System.out.println("Product is: " + a * b);
        System.out.println("Division is: " + a / b);
        System.out.println("Modulo is: " + a % b);
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println(a > 0 && b < 0);
        System.out.println(a > 0 || b > 0);
        System.out.println(a >= 0);
        System.out.println(a > 0);
    }
}
