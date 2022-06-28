package com.company;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        int num ;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        num=s.nextInt();

        if(num>10){
            System.out.println(num + " greater than 10");}
        else if(num==10){
            System.out.println(num +" is equal to 10");
        }
        else{
            System.out.println(num +" is less than 10");
        }
    }
}
