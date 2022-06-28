package com.company;

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        if ((year % 4 == 0 && year % 400 == 0)||(year%100!=0)) {
            System.out.println("leap year");
        }
        else
        {
            System.out.println("not leap year");
        }
    }
}
