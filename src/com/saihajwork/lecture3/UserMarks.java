package com.saihajwork.lecture3;

import java.util.Scanner;

public class UserMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int marks = in.nextInt();
        switch (marks > 60 ? 1 : 0) {
            case 1:
                System.out.println("Keep going");
            case 0:
                System.out.println("Need to improve");
        }

        if (marks > 85) {
            System.out.println("Well Done");
        } else if (marks <= 85 && marks > 60) {
            System.out.println("Keep Up");
        } else {
            System.out.println("Need to Improve");
        }

    }
}
