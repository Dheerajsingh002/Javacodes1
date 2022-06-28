package com.company;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter your name and age");
        String name=s.nextLine();
//        int age=s.nextInt();
        double age= s.nextDouble();
        System.out.println(name+"! "+"You are "+age+" years old!");

    }
}
