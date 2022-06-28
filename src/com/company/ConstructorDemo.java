package com.company;

import java.util.Scanner;

public class ConstructorDemo {
    int num1;//instance variable
    int num2;//instance variable
//static int a;   // static variable is known as class variable
//    public void setvalue()
//    {
//       num1=34;
//       num2=78;
//    }
//     to initialize the object we use constructor
  ConstructorDemo()
  {
//      num1 = 10;
//      num2 = 20;
      Scanner s = new Scanner(System.in);
      num1=s.nextInt();
      num2=s.nextInt();
//      s.close();


  }// no return type of constructor
    public void show()
    {
        System.out.println(num1);
        System.out.println(num2);
    }
}
class ConstructorDemomain
{
    public static void main(String[] args) {
        ConstructorDemo obj = new ConstructorDemo();
        ConstructorDemo obj1 = new ConstructorDemo();

        obj.show();
        obj1.show();
    }
}
// there are two types of constructors
// 1. parameterize(argument pass)   and non- perameterize(no argument pass)

