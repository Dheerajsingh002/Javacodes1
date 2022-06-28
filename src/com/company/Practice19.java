package com.company;

import java.util.Scanner;

public class Practice19 {
    public static void main(String[] args) {
        int rem,rev=0,temp;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        temp=n;
        while(n!=0)
        {
            rem =n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(temp==rev)
            System.out.println(temp+" "+"palindrome");
        else
            System.out.println(temp+" "+"not palindrome");

    }
}
