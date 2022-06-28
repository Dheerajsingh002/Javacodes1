package com.company;

import java.util.Scanner;

public class Student {
     String name;  // instance variable
    Student()   // constructor
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the name");
//        s.nextLine();
        name = s.nextLine();
//        s.close();
    }
    public void printvalue()
    {
        System.out.println(name);
    }
}
class StudentMain
{
    public static void main(String[] args) {
        Student obj = new Student();
        obj.printvalue();

    }
}
