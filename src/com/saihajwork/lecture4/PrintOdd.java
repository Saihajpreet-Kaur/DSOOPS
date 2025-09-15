package com.saihajwork.lecture4;

public class PrintOdd {
    public static void main(String[] args) {
        for(int i = 1; i <= 30; ++i) {
            if ((i & 1) == 1) {
                System.out.println(i);
            }
        }

    }
}
