package com.company;

import java.util.Scanner;

public class Practice18 {
    public static void main(String[] args) {
        int a,b,c,d,e,f;
        Scanner s=new Scanner(System.in);
        System.out.println("enter first number");
        a=s.nextInt();
        System.out.println("enter the second number");
        b=s.nextInt();
        System.out.println("enter the third number");
        c=s.nextInt();
        System.out.println("enter the fourth number");
        d=s.nextInt();
        System.out.println("enter the fifth number");
        e=s.nextInt();
        f=a+b+c+d+e;
        System.out.println("the sum of five number is: " + f);
    }
}
