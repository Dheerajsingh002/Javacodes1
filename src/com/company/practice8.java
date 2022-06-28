package com.company;

import java.util.Scanner;

public class practice8 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the prize of note book ");
        int prize=s.nextInt();
        System.out.println("enter the prize of pen ");
        int prize1=s.nextInt();
        System.out.println("enter the cash ");
        int cash=s.nextInt();
        while(cash<=50){
        if(cash<10){
            System.out.println(cash +" "+"do not purchase any thing");
        }
        else if(cash<=50 && cash>=10){
            System.out.println(cash +" "+"it purchase both things");
        }
        else{
            System.out.println(cash+" "+"it can purchase only one thing");
        }
//
    }
}
    }


//  String methods
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
//    String name="DHEERAJ AND GAURAV";
//        String name6="SINGH";
////        String name7=name+" "+name6;
////        System.out.println(name7);
////        String name3="dheeraj";
////        String name1=name.toLowerCase();
////        String name2=name3.toUpperCase();
////        String name4=name.replace('D','A');
//        String name8=name.substring(7,11);
//        System.out.println(name8);
////        System.out.println(name1);
////        System.out.println(name2);
////        System.out.println(name4);
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&


//    Math methods
//*********************************************
//  System.out.println(Math.max(8,9));
//        System.out.println(Math.min(8,9));
//        System.out.println((int)Math.random()*100);
//        System.out.println(Math.multiplyExact(2,3));
//**********************************************************

//  Practice program
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//    Scanner s=new Scanner(System.in);
//        System.out.println("enter the age ");
//        int age=s.nextInt();
//        if(age>18){
//            System.out.println(age+" "+ "they elligible for vote ");
//        }
//        else if(age==18){
//            System.out.println(age+" "+"they are also eligible for vote ");
//        }
//        else {
//            System.out.println(age + " "+"they do not elligible for vote ");
//        }
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^