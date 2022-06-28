package com.company;

import java.util.Scanner;

public class Favorite {
    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the four digit number");
        n=s.nextInt();

        //ABCD
        int fourth=n%10; //D
        int third=(n/10)%10; //ABC % 10=C
        int second=(n/100)%10;//AB %10=B
        int first=(n/1000)%10;//A % 10=A
        if(first+second==third+fourth)
            System.out.println("lucky");
        else
            System.out.println("not lucky");
    }
}
