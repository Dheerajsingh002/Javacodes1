package com.company;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the integer ");
        int num = s.nextInt();
        if(num%2==0)
        {System.out.println(num +" is even");}
        if(num%2==1)
            {System.out.println(num +" is odd");
            }
//        else{
//            System.out.println(num+" is odd");
//        }

//        int x=5;
//        int y=10;
//        if(x>y){
//            System.out.println("the minimum is "+x);
//            if(y>x){
//                System.out.println("maximum is "+y);
//            }
//        }

    }
}
