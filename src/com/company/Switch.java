package com.company;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int num;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        num=s.nextInt();

        switch (num%2){
            case 0:
                System.out.println("even");
                break;
            case 1:
                System.out.println("odd");
            }
        }

    }

