package com.company;

import java.util.Scanner;

public class Box {
    double width;
    double height;
    double depth;
    double volume;
    Box()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the width");
        width = s.nextDouble();
        System.out.println("enter the height");
        height= s.nextDouble();
        System.out.println("enter the depth");
        depth=s.nextDouble();
        System.out.println("volume is: ");

    }
    public void Printvalue()
    {
//        System.out.println(width);
//        System.out.println(height);
//        System.out.println(depth);
        System.out.println(width*height*depth);
    }
}
class BoxMain
{
   public static void main(String[] args) {
        Box obj = new Box();
        obj.Printvalue();
    }
}
