package com.company;

import java.util.Scanner;

public class Free {
        public String name;
    public float percentage;
    public String name1;
    public float percentage1;


    Free()
    {
        Scanner s =new Scanner(System.in);
        System.out.println("enter the first name");
        name=s.nextLine();
        System.out.println("enter the percentage of fist student");
        percentage=s.nextFloat();
        System.out.println("enter the second name");
        s.nextLine();
        name1=s.nextLine();
        System.out.println("enter the second percentage");
        percentage1=s.nextFloat();


    }
    public void test()
    {
        System.out.println(name);
        System.out.println(percentage);
        System.out.println(name1);
        System.out.println(percentage1);

    }
    public void print()
    {
        System.out.println(name);
        System.out.println(percentage);
    }

}
class FreeMain
{
    public static void main(String[] args) {
//        Free obj=new Free();
//        obj.test();
        Free obj2=new Free();
        obj2.print();
    }
}
