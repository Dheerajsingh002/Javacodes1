package com.company;

import java.util.Scanner;

public class ABHI {
    String name;
    float percentage;
    Scanner s=new Scanner(System.in);
    ABHI(){
        System.out.println("enter the name");
        name=s.nextLine();
        System.out.println("enter the percentage");
        percentage=s.nextFloat();

    }
    void print(){
        System.out.println(name);
        System.out.println(percentage);
    }
}
class Abhimain{
    public static void main(String[] args) {
        ABHI s1=new ABHI();
        ABHI s2=new ABHI();
        ABHI s3=new ABHI();
        s1.print();
        s2.print();
        s3.print();
    }
}
