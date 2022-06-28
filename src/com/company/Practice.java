package com.company;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
//         int num;
        int num1;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the first number");
       int num=s.nextInt();
//       Scanner s1=new Scanner(System.in);
        System.out.println("enter the second number");
       num1= s.nextInt();
        System.out.println("the sum of first number and second number is "+(num+num1));
    }
}
