package com.company;

public class Stu1 {
    int rollno;
    int marks;
    String name;
    String cname;
    String coursrname;
}
class Test45
{   int num;
    Stu1 obj;// member attribute  instance variable
    Test45()
    {
        num =90;
        obj =new Stu1();
        obj.rollno =100;
    }
}
class Test45Main
{
    public static void main(String[] args) {
        Test45 abcd = new Test45();
        System.out.println(abcd.num);
        System.out.println(abcd.obj.rollno);//nesting
    }
}

